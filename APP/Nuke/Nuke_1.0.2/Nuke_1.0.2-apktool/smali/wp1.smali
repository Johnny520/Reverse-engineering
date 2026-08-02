.class public final synthetic Lwp1;
.super Lyn0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# static fields
.field public static final o:Lwp1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lwp1;

    .line 2
    .line 3
    const-string v4, "<init>(Landroid/content/Context;)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, Log3;

    .line 8
    .line 9
    const-string v3, "<init>"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lyn0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lwp1;->o:Lwp1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Log3;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    invoke-virtual {v0, p0}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 13
    .line 14
    .line 15
    const/16 v5, 0x18

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    const/16 v3, 0x8

    .line 23
    .line 24
    const/16 v4, 0x8

    .line 25
    .line 26
    invoke-virtual/range {v0 .. v6}, Landroid/opengl/GLSurfaceView;->setEGLConfigChooser(IIIIII)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    invoke-virtual {v0, p0}, Landroid/opengl/GLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lpg3;

    .line 34
    .line 35
    invoke-direct {p1}, Lpg3;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
