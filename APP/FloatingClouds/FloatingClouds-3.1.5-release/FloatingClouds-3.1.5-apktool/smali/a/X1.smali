.class public abstract La/X1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/luckypray/dexkit/DexKitBridge;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    const-string p2, "bridge"

    invoke-static {p1, p2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/X1;->a:Lorg/luckypray/dexkit/DexKitBridge;

    return-void
.end method

.method public static a(II)J
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method
