.class public LYue/ۥۡۤۦ۟$ۥ۟۟;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "LYue/\u06e5\u06e1\u06e4\u06e6\u06df;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۡۤۦ۟$ۥ۟;Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # LYue/ۥۡۤۦ۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    new-instance v0, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۤۦ۟$ۥ۟۟$ۥ;-><init>(LYue/ۥۡۤۦ۟$ۥ۟;Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-void
.end method
