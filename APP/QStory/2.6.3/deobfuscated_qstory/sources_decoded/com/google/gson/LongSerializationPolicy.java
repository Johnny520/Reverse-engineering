package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3257 serialize(Long l) {
            return l == null ? C3254.f10951 : new C3248(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3257 serialize(Long l) {
            return l == null ? C3254.f10951 : new C3248(l.toString());
        }
    };

    public abstract AbstractC3257 serialize(Long l);
}
