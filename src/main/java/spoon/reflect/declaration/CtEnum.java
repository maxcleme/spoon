/**
 * Copyright (C) 2006-2015 INRIA and contributors
 * Spoon - http://spoon.gforge.inria.fr/
 *
 * This software is governed by the CeCILL-C License under French law and
 * abiding by the rules of distribution of free software. You can use, modify
 * and/or redistribute the software under the terms of the CeCILL-C license as
 * circulated by CEA, CNRS and INRIA at http://www.cecill.info.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the CeCILL-C License for more details.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C license and that you accept its terms.
 */
package spoon.reflect.declaration;

import java.util.List;

/**
 * This element represents an enumeration declaration.
 */
public interface CtEnum<T extends Enum<?>> extends CtClass<T> {
	/**
	 * Adds an enum value.
	 *
	 * @param enumValue
	 * 		An enum value.
	 * @return <tt>true</tt> if this element changed as a result of the call
	 */
	<C extends CtEnum<T>> C addEnumValue(CtEnumValue<?> enumValue);

	/**
	 * Removes en enum value.
	 *
	 * @param enumValue
	 * 		An enum value.
	 * @return <tt>true</tt> if this element changed as a result of the call
	 */
	boolean removeEnumValue(CtEnumValue<?> enumValue);

	/**
	 * Gets an enum value by its name.
	 *
	 * @param name
	 * 		Name of the enum value.
	 * @return An enum value.
	 */
	CtEnumValue<?> getEnumValue(String name);

	/**
	 * Gets all enum values of the enumeration.
	 *
	 * @return All enum values.
	 */
	List<CtEnumValue<?>> getEnumValues();

	/**
	 * Returns the set of predefined constant values of this enum
	 * @see #getEnumValues()
	 */
	@Deprecated
	List<CtField<?>> getValues();

	@Override
	CtEnum<T> clone();
}
