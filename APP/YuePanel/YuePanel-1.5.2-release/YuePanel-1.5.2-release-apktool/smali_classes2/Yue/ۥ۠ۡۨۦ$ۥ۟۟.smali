.class public abstract LYue/ۥ۠ۡۨۦ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/io/File;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "root"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/io/File;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۨۦ$ۥ۟۟;->ۥ:Ljava/io/File;

    return-object v0
.end method

.method public abstract ۥ۟()Ljava/io/File;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method
