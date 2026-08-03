.class public final LYue/ۥ۠ۧۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/io/BufferedReader;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/BufferedReader;)V
    .locals 1
    .param p1    # Ljava/io/BufferedReader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "reader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۧۡۥ;->ۥ:Ljava/io/BufferedReader;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۠ۧۡۥ;)Ljava/io/BufferedReader;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۧۡۥ;->ۥ:Ljava/io/BufferedReader;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۧۡۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۧۡۥ$ۥ;-><init>(LYue/ۥ۠ۧۡۥ;)V

    return-object v0
.end method
