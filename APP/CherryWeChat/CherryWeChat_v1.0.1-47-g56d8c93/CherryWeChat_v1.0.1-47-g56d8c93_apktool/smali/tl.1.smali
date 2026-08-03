.class public final Ltl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwc;


# instance fields
.field public final a:Lzp;


# direct methods
.method public constructor <init>(Lzp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl;->a:Lzp;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lxc;
    .locals 2

    check-cast p1, Ljava/io/InputStream;

    new-instance v0, LD2;

    iget-object v1, p0, Ltl;->a:Lzp;

    invoke-direct {v0, p1, v1}, LD2;-><init>(Ljava/io/InputStream;Lzp;)V

    return-object v0
.end method
