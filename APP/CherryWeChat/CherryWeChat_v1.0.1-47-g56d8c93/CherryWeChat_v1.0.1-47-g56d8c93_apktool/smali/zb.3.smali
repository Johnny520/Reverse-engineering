.class public final Lzb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lyb;


# direct methods
.method public constructor <init>(Lyb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzb;->a:Lyb;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzb;->a:Lyb;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
