.class public final L۟/m3$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/m3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ()Ljava/lang/String;
    .locals 4

    const-string v0, "\u06d7\u06d7\u06d8\u06d8\u06ec\u06e8\u06d6\u06d8\u06d7\u06d9\u06e6\u06da\u06dc\u06dc\u06d8\u06e0\u06e6\u06e0\u06db\u06dc\u06d8\u06d8\u06d8\u06ec\u06ec\u06e2\u06e1\u06d8\u06e2\u06d9\u06e4\u06d8\u06db\u06e5\u06d6\u06d9\u06e4\u06e7\u06e2\u06ec\u06dc\u06e6\u06e0\u06ec\u06d8\u06d6\u06e2\u06db\u06e2"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x3bf

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5e

    const/16 v2, 0x24

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x1e

    const/16 v2, 0xff

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x24e

    const/16 v2, 0x2df

    const v3, -0x41868e9e

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v0, L۟/m3;->ۥ:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x7021d76f
        :pswitch_0
    .end packed-switch
.end method
