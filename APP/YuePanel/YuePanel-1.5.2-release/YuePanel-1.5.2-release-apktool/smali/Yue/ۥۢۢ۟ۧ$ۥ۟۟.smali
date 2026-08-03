.class public LYue/ۥۢۢ۟ۧ$ۥ۟۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢ۟ۧ;->animate(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۢ۟ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢ۟ۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥ۟۟;->ۥ:LYue/ۥۢۢ۟ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥ۟۟;->ۥ:LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۢۢ۟ۧ;->end()V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
