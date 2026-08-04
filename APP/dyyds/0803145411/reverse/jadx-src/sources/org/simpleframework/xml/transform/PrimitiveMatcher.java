package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveMatcher implements Matcher {
    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        if (cls == Integer.TYPE) {
            return new IntegerTransform();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanTransform();
        }
        if (cls == Long.TYPE) {
            return new LongTransform();
        }
        if (cls == Double.TYPE) {
            return new DoubleTransform();
        }
        if (cls == Float.TYPE) {
            return new FloatTransform();
        }
        if (cls == Short.TYPE) {
            return new ShortTransform();
        }
        if (cls == Byte.TYPE) {
            return new ByteTransform();
        }
        if (cls == Character.TYPE) {
            return new CharacterTransform();
        }
        return null;
    }
}
