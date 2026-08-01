package p265s1;

import android.graphics.Shader;

/* JADX INFO: renamed from: s1.h1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7083h1 {

    /* JADX INFO: renamed from: s1.h1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC7070e3 {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Shader f23556f;

        public a(Shader shader) {
            this.f23556f = shader;
        }

        @Override // p265s1.AbstractC7070e3
        /* JADX INFO: renamed from: b */
        public Shader mo27856b(long j10) {
            return this.f23556f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC7070e3 m27895a(Shader shader) {
        return new a(shader);
    }
}
