.class public final LYw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LZg;


# instance fields
.field public final a:Ljava/security/MessageDigest;

.field public final b:Lfz;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfz;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LYw;->b:Lfz;

    iput-object p1, p0, LYw;->a:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final c()Lfz;
    .locals 1

    iget-object v0, p0, LYw;->b:Lfz;

    return-object v0
.end method
