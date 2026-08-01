package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3256 serialize(Long l) {
            return l == null ? C3253.f10946 : new C3247(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3256 serialize(Long l) {
            return l == null ? C3253.f10946 : new C3247(l.toString());
        }
    };

    public abstract AbstractC3256 serialize(Long l);
}
