package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC4089 serialize(Long l) {
            return l == null ? C4086.f11296 : new C4080(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC4089 serialize(Long l) {
            return l == null ? C4086.f11296 : new C4080(l.toString());
        }
    };

    public abstract AbstractC4089 serialize(Long l);
}
