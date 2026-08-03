.class public LYue/ۥۡۦۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۥ۟$ۥ$ۥ;
    }
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۥ۟$ۥ;->ۥ:Ljava/lang/String;

    iput p2, p0, LYue/ۥۡۦۥ۟$ۥ;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    new-instance v0, LYue/ۥۡۦۥ۟$ۥ$ۥ;

    iget-object v1, p0, LYue/ۥۡۦۥ۟$ۥ;->ۥ:Ljava/lang/String;

    iget v2, p0, LYue/ۥۡۦۥ۟$ۥ;->ۥ۟:I

    invoke-direct {v0, p1, v1, v2}, LYue/ۥۡۦۥ۟$ۥ$ۥ;-><init>(Ljava/lang/Runnable;Ljava/lang/String;I)V

    return-object v0
.end method
