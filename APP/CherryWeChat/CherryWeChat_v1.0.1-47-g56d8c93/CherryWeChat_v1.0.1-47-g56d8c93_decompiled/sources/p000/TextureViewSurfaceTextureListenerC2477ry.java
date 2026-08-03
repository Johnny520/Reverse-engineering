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
        MediaPlayer mediaPlayer = this.f8708a;
        if (mediaPlayer == null) {
            return;
        }
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = this.f8708a.getVideoHeight();
        if (videoWidth == 0 || videoHeight == 0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f = width;
        float f2 = videoWidth;
        float f3 = height;
        float f4 = videoHeight;
        float fMax = Math.max(f / f2, f3 / f4);
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax, f / 2.0f, f3 / 2.0f);
        matrix.postTranslate((f - (f2 * fMax)) / 2.0f, (f3 - (f4 * fMax)) / 2.0f);
        setTransform(matrix);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f8708a = mediaPlayer;
            mediaPlayer.setDataSource(this.f8709b);
            this.f8708a.setLooping(true);
            this.f8708a.setSurface(new Surface(surfaceTexture));
            float f = this.f8710c ? 1.0f : 0.0f;
            this.f8708a.setVolume(f, f);
            this.f8708a.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: py
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i3, int i4) {
                    this.f8393a.m4963a();
                }
            });
            this.f8708a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: qy
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    TextureViewSurfaceTextureListenerC2477ry textureViewSurfaceTextureListenerC2477ry = this.f8541a;
                    textureViewSurfaceTextureListenerC2477ry.getClass();
                    mediaPlayer2.start();
                    textureViewSurfaceTextureListenerC2477ry.m4963a();
                }
            });
            this.f8708a.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MediaPlayer mediaPlayer = this.f8708a;
        if (mediaPlayer == null) {
            return true;
        }
        mediaPlayer.release();
        this.f8708a = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        m4963a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setPlayWithSound(boolean z) {
        this.f8710c = z;
        MediaPlayer mediaPlayer = this.f8708a;
        if (mediaPlayer != null) {
            float f = z ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setVideoPath(String str) {
        this.f8709b = str;
    }
}
