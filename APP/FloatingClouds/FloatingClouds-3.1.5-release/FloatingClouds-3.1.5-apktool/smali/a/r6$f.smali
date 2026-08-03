.class public final La/r6$f;
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
        "La/b3;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic c:La/r6;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;I)V
    .locals 0

    iput-object p1, p0, La/r6$f;->b:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/r6$f;->c:La/r6;

    iput p3, p0, La/r6$f;->d:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, La/r6$f;->c:La/r6;

    iget v0, v0, La/r6;->e:I

    iget v1, p0, La/r6$f;->d:I

    invoke-static {v1, v0}, La/X1;->a(II)J

    move-result-wide v0

    const/4 v2, 0x1

    new-array v2, v2, [J

    const/4 v3, 0x0

    aput-wide v0, v2, v3

    iget-object v0, p0, La/r6$f;->b:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v0

    invoke-virtual {v0}, La/Y1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b3;

    return-object v0
.end method
