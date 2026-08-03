.class public LYue/ۥۢۢ۟ۧ$ۥ۟;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢ۟ۧ;->ۥ۟۟۠ۧ(Landroid/animation/Animator;LYue/ۥ۟ۡۨۡ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۡۨۡ;

.field public final synthetic ۥ۟:LYue/ۥۢۢ۟ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢ۟ۧ;LYue/ۥ۟ۡۨۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥ۟;->ۥ۟:LYue/ۥۢۢ۟ۧ;

    iput-object p2, p0, LYue/ۥۢۢ۟ۧ$ۥ۟;->ۥ:LYue/ۥ۟ۡۨۡ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥ۟;->ۥ:LYue/ۥ۟ۡۨۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥ۟;->ۥ۟:LYue/ۥۢۢ۟ۧ;

    iget-object v0, v0, LYue/ۥۢۢ۟ۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥ۟;->ۥ۟:LYue/ۥۢۢ۟ۧ;

    iget-object v0, v0, LYue/ۥۢۢ۟ۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
