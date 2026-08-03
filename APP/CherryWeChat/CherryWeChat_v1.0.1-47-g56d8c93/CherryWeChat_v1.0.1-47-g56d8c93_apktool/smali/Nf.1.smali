.class public final LNf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LSm;


# static fields
.field public static final b:LNf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LNf;->b:LNf;

    return-void
.end method


# virtual methods
.method public final b(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
