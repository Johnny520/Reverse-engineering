package org.simpleframework.xml.core;

import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Entry {
    private static final String DEFAULT_NAME = "entry";
    private boolean attribute;
    private Contact contact;
    private String entry;
    private String key;
    private Class keyType;
    private ElementMap label;
    private String value;
    private Class valueType;

    public Entry(Contact contact, ElementMap elementMap) {
        this.attribute = elementMap.attribute();
        this.entry = elementMap.entry();
        this.value = elementMap.value();
        this.key = elementMap.key();
        this.contact = contact;
        this.label = elementMap;
    }

    private Class getDependent(int i) {
        Class[] dependents = this.contact.getDependents();
        return (dependents.length >= i && dependents.length != 0) ? dependents[i] : Object.class;
    }

    private boolean isEmpty(String str) {
        return str.length() == 0;
    }

    public Contact getContact() {
        return this.contact;
    }

    public String getEntry() {
        String str = this.entry;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.entry = DEFAULT_NAME;
        }
        return this.entry;
    }

    public Converter getKey(Context context) {
        Type keyType = getKeyType();
        return context.isPrimitive(keyType) ? new PrimitiveKey(context, this, keyType) : new CompositeKey(context, this, keyType);
    }

    public Type getKeyType() {
        Class clsKeyType = this.keyType;
        if (clsKeyType == null) {
            clsKeyType = this.label.keyType();
            this.keyType = clsKeyType;
            if (clsKeyType == Void.TYPE) {
                clsKeyType = getDependent(0);
                this.keyType = clsKeyType;
            }
        }
        return new ClassType(clsKeyType);
    }

    public Converter getValue(Context context) {
        Type valueType = getValueType();
        return context.isPrimitive(valueType) ? new PrimitiveValue(context, this, valueType) : new CompositeValue(context, this, valueType);
    }

    public Type getValueType() {
        Class clsValueType = this.valueType;
        if (clsValueType == null) {
            clsValueType = this.label.valueType();
            this.valueType = clsValueType;
            if (clsValueType == Void.TYPE) {
                clsValueType = getDependent(1);
                this.valueType = clsValueType;
            }
        }
        return new ClassType(clsValueType);
    }

    public boolean isAttribute() {
        return this.attribute;
    }

    public boolean isInline() {
        return isAttribute();
    }

    public String toString() {
        return String.format("%s on %s", this.label, this.contact);
    }

    public String getKey() {
        String str = this.key;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.key = null;
        }
        return this.key;
    }

    public String getValue() {
        String str = this.value;
        if (str == null) {
            return str;
        }
        if (isEmpty(str)) {
            this.value = null;
        }
        return this.value;
    }
}
