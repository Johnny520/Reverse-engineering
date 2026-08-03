.class public abstract LYue/ۥ۟۠ۥۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5"
.end annotation


# instance fields
.field mPlatformCallback:Landroid/graphics/drawable/Animatable2$AnimationCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPlatformCallback()Landroid/graphics/drawable/Animatable2$AnimationCallback;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۠ۥۧ$ۥ;->mPlatformCallback:Landroid/graphics/drawable/Animatable2$AnimationCallback;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟۠ۥۧ$ۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟۠ۥۧ$ۥ$ۥ;-><init>(LYue/ۥ۟۠ۥۧ$ۥ;)V

    iput-object v0, p0, LYue/ۥ۟۠ۥۧ$ۥ;->mPlatformCallback:Landroid/graphics/drawable/Animatable2$AnimationCallback;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۠ۥۧ$ۥ;->mPlatformCallback:Landroid/graphics/drawable/Animatable2$AnimationCallback;

    return-object v0
.end method

.method public onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method
