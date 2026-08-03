package p000;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;

/* JADX INFO: renamed from: ry */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC2477ry extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f8708a;

    /* JADX INFO: renamed from: b */
    public String f8709b;

    /* JADX INFO: renamed from: c */
    public boolean f8710c;

    /* JADX INFO: renamed from: a */
    public final void m4963a() {
        MediaPlayer r0 = this.f8708a;
        if (r0 == null) goto L17;
        int r02 = r0.getVideoWidth();
        int r1 = this.f8708a.getVideoHeight();
        if (r02 == 0) goto L15;
        if (r1 == 0) goto L18;
        int r2 = getWidth();
        int r3 = getHeight();
        if (r2 == 0) goto L16;
        if (r3 == 0) goto L19;
        float r22 = r2;
        float r03 = r02;
        float r32 = r3;
        float r12 = r1;
        float r4 = Math.max(r22 / r03, r32 / r12);
        Matrix r6 = new Matrix();
        r6.setScale(r4, r4, r22 / 2.0f, r32 / 2.0f);
        r6.postTranslate((r22 - (r03 * r4)) / 2.0f, (r32 - (r12 * r4)) / 2.0f);
        setTransform(r6);
        return;
    L19:
        return;
    L16:
        return;
    L18:
        return;
    L15:
        return;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture r1, int r2, int r3) {
        MediaPlayer r22 = new MediaPlayer();     // Catch: IOException -> L8
        this.f8708a = r22;     // Catch: IOException -> L8
        r22.setDataSource(this.f8709b);     // Catch: IOException -> L8
        this.f8708a.setLooping(true);     // Catch: IOException -> L8
        this.f8708a.setSurface(new Surface(r1));     // Catch: IOException -> L8
        if (this.f8710c == false) goto L5;
        float r12 = 1.0f;
    L6:
        this.f8708a.setVolume(r12, r12);     // Catch: IOException -> L8
        this.f8708a.setOnVideoSizeChangedListener(new C2391py(this));     // Catch: IOException -> L8
        this.f8708a.setOnPreparedListener(new C2434qy(this));     // Catch: IOException -> L8
        this.f8708a.prepareAsync();     // Catch: IOException -> L8
        return;
    L5:
        r12 = 0.0f;
    L8:
        e = move-exception;
        e.printStackTrace();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture r1) {
        MediaPlayer r12 = this.f8708a;
        if (r12 == null) goto L7;
        r12.release();
        this.f8708a = null;
        return true;
    L7:
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture r1, int r2, int r3) {
        m4963a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture r1) {
    }

    public void setPlayWithSound(boolean r2) {
        this.f8710c = r2;
        MediaPlayer r0 = this.f8708a;
        if (r0 == null) goto L9;
        if (r2 == false) goto L6;
        float r22 = 1.0f;
    L7:
        r0.setVolume(r22, r22);
        return;
    L6:
        r22 = 0.0f;
        goto L7
    }

    public void setVideoPath(String r1) {
        this.f8709b = r1;
    }
}
