.class public abstract LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۡۦ۟ۢ;

.field public ۥ۟:I

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۟ۢ;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iput p2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    iput p3, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۥ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
.end method
