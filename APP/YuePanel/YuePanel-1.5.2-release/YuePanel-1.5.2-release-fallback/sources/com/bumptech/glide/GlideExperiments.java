package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class GlideExperiments {
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments;

    public static final class Builder {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.experiments = r0
                return
        }

        public static /* synthetic */ java.util.Map access$000(com.bumptech.glide.GlideExperiments.Builder r0) {
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r0.experiments
                return r0
        }

        public com.bumptech.glide.GlideExperiments.Builder add(com.bumptech.glide.GlideExperiments.Experiment r3) {
                r2 = this;
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r2.experiments
                java.lang.Class r1 = r3.getClass()
                r0.put(r1, r3)
                return r2
        }

        public com.bumptech.glide.GlideExperiments build() {
                r1 = this;
                com.bumptech.glide.GlideExperiments r0 = new com.bumptech.glide.GlideExperiments
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.GlideExperiments.Builder update(com.bumptech.glide.GlideExperiments.Experiment r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L6
                r0.add(r1)
                goto Lf
            L6:
                java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r2 = r0.experiments
                java.lang.Class r1 = r1.getClass()
                r2.remove(r1)
            Lf:
                return r0
        }
    }

    public interface Experiment {
    }

    public GlideExperiments(com.bumptech.glide.GlideExperiments.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r2 = com.bumptech.glide.GlideExperiments.Builder.access$000(r2)
            r0.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            r1.experiments = r2
            return
    }

    @Yue.InterfaceC4544
    public <T extends com.bumptech.glide.GlideExperiments.Experiment> T get(java.lang.Class<T> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r1.experiments
            java.lang.Object r2 = r0.get(r2)
            com.bumptech.glide.GlideExperiments$Experiment r2 = (com.bumptech.glide.GlideExperiments.Experiment) r2
            return r2
    }

    public boolean isEnabled(java.lang.Class<? extends com.bumptech.glide.GlideExperiments.Experiment> r2) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments$Experiment> r0 = r1.experiments
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
