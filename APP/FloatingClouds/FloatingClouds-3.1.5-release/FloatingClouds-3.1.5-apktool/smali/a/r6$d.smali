.class public final La/r6$d;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/r6;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/s7<",
        "La/Y4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:La/r6;


# direct methods
.method public constructor <init>(La/r6;)V
    .locals 0

    iput-object p1, p0, La/r6$d;->b:La/r6;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    new-instance v0, La/Y4;

    iget-object v1, p0, La/r6$d;->b:La/r6;

    iget-object v1, v1, La/r6;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, La/Y4;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
