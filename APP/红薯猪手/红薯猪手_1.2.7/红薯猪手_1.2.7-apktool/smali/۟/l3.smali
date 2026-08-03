.class public final L۟/l3;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static ۥ:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static ۥ۟:Ljava/lang/ClassLoader;

.field public static ۥ۟۟:Ljava/lang/String;

.field public static ۥ۟۠:I

.field public static ۥ۟ۡ:I

.field public static ۥ۟ۢ:Z


# direct methods
.method public static ۥ()Z
    .locals 8

    const/4 v2, 0x0

    const-string v0, "\u06e5\u06e1\u06e8\u06d8\u06dc\u06e6\u06d8\u06d7\u06d9\u06e7\u06d9\u06e0\u06e2\u06d6\u06db\u06e8\u06d8\u06dc\u06d6\u06ec\u06d7\u06d7\u06da\u06d7\u06da\u06d6\u06e5\u06df\u06e8\u06e6\u06e6\u06d8\u06e5\u06d6\u06e7\u06d9\u06df\u06e1\u06e2\u06e6\u06e1\u06d7\u06e8\u06d8\u06e1\u06eb\u06da\u06d9\u06da\u06d9\u06e6\u06e0\u06e5\u06d8\u06d6\u06e7\u06da\u06d8\u06d8\u06e7\u06e8\u06e8\u06e7\u06e6\u06d6\u06d8"

    move v1, v2

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x86

    xor-int/2addr v4, v5

    xor-int/lit16 v4, v4, 0x2a2

    const/16 v5, 0x207

    xor-int/2addr v4, v5

    xor-int/lit16 v4, v4, 0x30a

    const/16 v5, 0x6e

    xor-int/2addr v4, v5

    xor-int/lit16 v4, v4, 0xa8

    const/16 v5, 0x22e

    const v6, 0x6328837d

    xor-int/2addr v4, v5

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const v4, -0x33e273b7    # -4.130026E7f

    const-string v0, "\u06e6\u06ec\u06d6\u06d8\u06dc\u06e6\u06e7\u06d7\u06db\u06e7\u06d8\u06d7\u06e6\u06d8\u06d6\u06db\u06e5\u06d7\u06e8\u06d6\u06e6\u06e0\u06df\u06df\u06ec\u06eb\u06da\u06db\u06d9\u06e6\u06d9\u06e5\u06d8\u06da\u06d7\u06d8\u06e6\u06e1\u06d9\u06dc\u06d6\u06e5\u06d8\u06e0\u06eb\u06e4\u06e4\u06dc\u06e5\u06e4\u06eb\u06d8\u06d8\u06d8\u06db\u06d7\u06da\u06e8\u06eb\u06e7\u06df\u06eb\u06e7\u06e6\u06db\u06d8\u06e8\u06e5\u06e2\u06dc\u06e6\u06dc\u06db\u06e7\u06d7\u06dc\u06d9\u06dc\u06e4\u06eb\u06e5\u06e4\u06da\u06d6\u06e7\u06d9"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "\u06e8\u06e2\u06e5\u06e8\u06d6\u06db\u06da\u06ec\u06e7\u06e8\u06da\u06da\u06d9\u06dc\u06e7\u06d8\u06d6\u06e7\u06e6\u06e1\u06e8\u06e7\u06d8\u06dc\u06db\u06d6\u06d8\u06e4\u06e5\u06dc\u06db\u06df\u06e8\u06ec\u06e1\u06d8\u06ec\u06dc\u06d6\u06e8\u06d8\u06df\u06e8\u06db\u06d8\u06e7\u06e1\u06d8\u06e5\u06ec\u06e2\u06e2\u06ec\u06eb\u06dc\u06dc\u06eb\u06d6\u06dc\u06dc\u06d8\u06d8\u06dc\u06d7\u06e8"

    goto :goto_0

    :sswitch_2
    const-string v0, "\u06e5\u06d9\u06d9\u06e2\u06e6\u06d8\u06e5\u06e5\u06eb\u06e8\u06e8\u06d8\u06d8\u06eb\u06e7\u06e6\u06df\u06e6\u06e8\u06e2\u06e2\u06d8\u06d8\u06d8\u06d8\u06d9\u06d7\u06e8\u06da\u06d8\u06d8\u06e0\u06e2\u06db\u06d7\u06d7\u06ec\u06df\u06e4\u06eb\u06e1\u06d8\u06d9\u06e6\u06e7\u06d8\u06db\u06d8\u06e7\u06e6\u06eb\u06e5\u06e5\u06e1\u06dc\u06d8\u06e8\u06df\u06dc\u06ec\u06e5\u06e5\u06d8\u06dc\u06e8\u06df\u06e1\u06e7\u06e4\u06e6\u06d8\u06d8\u06da\u06e4\u06d8\u06e4\u06e4\u06df\u06da\u06e0\u06ec\u06d6\u06eb\u06d6\u06d8\u06e1\u06e7"

    goto :goto_1

    :sswitch_3
    const v5, -0x58e34074

    const-string v0, "\u06e2\u06e7\u06da\u06e1\u06db\u06e0\u06ec\u06e5\u06d6\u06e0\u06e0\u06db\u06d6\u06e1\u06e1\u06d7\u06e2\u06e6\u06dc\u06e4\u06da\u06e1\u06e2\u06e5\u06e5\u06e8\u06ec\u06ec\u06df\u06d7\u06d6\u06d8\u06e7\u06e7\u06e1\u06dc\u06ec\u06d9\u06e0\u06db\u06d6\u06d8\u06d7\u06e7\u06e1\u06e5\u06e5\u06e5\u06d8\u06d7\u06ec\u06d6\u06db\u06e0\u06da\u06dc\u06d7\u06d8\u06d8\u06d8\u06d9\u06da\u06eb\u06d9\u06e6\u06d8\u06eb\u06e0\u06dc\u06d8\u06e0\u06e8\u06dc\u06d8\u06e6\u06e2\u06e6\u06d8\u06dc\u06ec\u06d6\u06d8\u06e8\u06dc\u06d7\u06e0\u06e2\u06d8"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const-string v0, "\u06e5\u06eb\u06e8\u06d8\u06da\u06e4\u06e4\u06d8\u06dc\u06e4\u06d9\u06e7\u06dc\u06d8\u06e7\u06d6\u06d6\u06d8\u06ec\u06d9\u06ec\u06d8\u06d8\u06d9\u06e7\u06dc\u06d8\u06e7\u06e5\u06d9\u06e2\u06da\u06e8\u06ec\u06e2\u06e4\u06d8\u06d7\u06da\u06da\u06da\u06e8\u06e8\u06db\u06e1\u06e5\u06d8\u06e2\u06e8\u06e5\u06e5\u06e7\u06e0\u06e7\u06e8\u06e4\u06e5\u06e6\u06db\u06d8\u06d7\u06db\u06eb\u06df\u06db\u06d8\u06e6\u06eb\u06e5\u06df\u06e1\u06d9\u06da\u06e0\u06e6\u06db\u06e0\u06ec\u06d9\u06d6\u06df\u06d8\u06d6"

    goto :goto_1

    :sswitch_5
    const-string v0, "\u06db\u06d7\u06e7\u06e2\u06dc\u06e7\u06d8\u06e1\u06ec\u06db\u06d9\u06eb\u06ec\u06d7\u06da\u06dc\u06e0\u06e5\u06e7\u06d6\u06da\u06e7\u06e1\u06e7\u06dc\u06e0\u06e7\u06dc\u06d8\u06e4\u06e0\u06ec\u06d8\u06d8\u06e2\u06e0\u06df\u06e7\u06e2\u06e1\u06d7\u06d9\u06e2\u06ec"

    goto :goto_2

    :sswitch_6
    const v6, -0x536b7af2

    const-string v0, "\u06e7\u06df\u06d9\u06db\u06e5\u06db\u06d8\u06db\u06d8\u06d8\u06dc\u06dc\u06e7\u06e5\u06dc\u06d6\u06e4\u06d6\u06d8\u06ec\u06e0\u06e8\u06d8\u06db\u06d7\u06e1\u06d8\u06d7\u06e6\u06e6\u06d8\u06ec\u06ec\u06e8\u06df\u06d8\u06e0\u06e2\u06e5\u06eb\u06db\u06df\u06e2\u06e8\u06e8\u06d8\u06da\u06ec\u06d8\u06d6\u06e8\u06da\u06e6\u06e0\u06e4\u06e4\u06d8\u06e8\u06d8\u06e5\u06da\u06e2\u06e7\u06e1\u06d8\u06d6\u06d8\u06e1\u06e7\u06da\u06df\u06e5\u06db\u06df\u06d6\u06db\u06e1"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v6

    sparse-switch v7, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    const-string v0, "\u06e7\u06db\u06ec\u06d7\u06d8\u06e2\u06e4\u06dc\u06eb\u06e0\u06db\u06d6\u06d8\u06e8\u06ec\u06d9\u06eb\u06e6\u06d9\u06e7\u06ec\u06dc\u06d6\u06e1\u06ec\u06ec\u06da\u06e4\u06db\u06e1\u06d8\u06e6\u06d6\u06e1\u06e1\u06e6\u06db\u06dc\u06ec\u06d7\u06e0\u06da\u06eb\u06e5\u06e1\u06d8"

    goto :goto_2

    :cond_0
    const-string v0, "\u06d8\u06e8\u06d6\u06d8\u06d9\u06e6\u06e7\u06e8\u06e5\u06e5\u06d8\u06d9\u06e7\u06e1\u06e8\u06e1\u06d9\u06e0\u06e1\u06e0\u06d8\u06df\u06d7\u06d6\u06d7\u06eb\u06eb\u06dc\u06d6\u06d8\u06eb\u06d7\u06e2\u06db\u06eb\u06ec\u06e1\u06e1\u06d9\u06dc\u06dc\u06da\u06dc\u06d6\u06df\u06d6\u06da\u06d7\u06e0\u06e0\u06e4\u06e0\u06e4\u06db\u06e5\u06e7\u06da\u06ec\u06d7\u06d6\u06eb\u06e8\u06d8\u06e5\u06d8\u06e2\u06e0\u06e1\u06df\u06eb\u06df\u06d8\u06d8\u06e1\u06dc\u06e6\u06e1\u06d8\u06dc\u06d8\u06d9\u06eb\u06da\u06e4\u06d7\u06d8"

    goto :goto_3

    :sswitch_8
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\u06d6\u06e4\u06d6\u06db\u06e7\u06e7\u06d9\u06db\u06df\u06ec\u06d7\u06df\u06e4\u06e1\u06e5\u06e7\u06e2\u06d8\u06d8\u06d8\u06e0\u06df\u06d8\u06d8\u06e0\u06db\u06d6\u06da\u06d9\u06db\u06e7\u06ec\u06d6\u06e0\u06ec\u06e8\u06df\u06ec\u06e8\u06df\u06ec\u06d6\u06d6\u06d8\u06d8\u06d8"

    goto :goto_3

    :sswitch_9
    const-string v0, "\u06e8\u06e1\u06d6\u06d8\u06ec\u06e1\u06dc\u06e0\u06df\u06da\u06d9\u06e1\u06e2\u06db\u06d8\u06e6\u06d9\u06d8\u06d8\u06e4\u06ec\u06e6\u06d8\u06eb\u06e7\u06e5\u06d6\u06e6\u06d7\u06e6\u06e0\u06d8\u06d9\u06db\u06e0\u06e1\u06db\u06e6\u06e6\u06dc\u06e6\u06d7\u06da\u06d6\u06d8\u06df\u06e4\u06e7"

    goto :goto_3

    :sswitch_a
    const-string v0, "\u06dc\u06dc\u06e4\u06e6\u06e2\u06e8\u06d8\u06eb\u06df\u06df\u06e1\u06e7\u06db\u06d7\u06e4\u06d6\u06dc\u06d6\u06dc\u06df\u06dc\u06d8\u06d8\u06d7\u06e7\u06d9\u06d6\u06e7\u06dc\u06dc\u06e6\u06e7\u06d8\u06dc\u06e0\u06d6\u06d8\u06e2\u06d7\u06dc\u06d8\u06eb\u06d6\u06e8\u06e2\u06e7\u06e4\u06df\u06d6\u06ec"

    goto :goto_2

    :sswitch_b
    const-string v0, "\u06ec\u06da\u06dc\u06d7\u06e8\u06e4\u06dc\u06e6\u06d8\u06e7\u06d6\u06e7\u06d7\u06da\u06e1\u06dc\u06e4\u06e4\u06e7\u06d7\u06d7\u06d9\u06e1\u06e5\u06d8\u06e5\u06d9\u06e1\u06d8\u06e8\u06e4\u06d7\u06ec\u06e8\u06d9\u06df\u06d9\u06e1\u06d8\u06d6\u06df\u06d7\u06d9\u06e6\u06d7\u06db\u06eb\u06d8\u06d6\u06e1\u06df\u06e0\u06e6\u06e1\u06e5\u06e8\u06d8\u06d8\u06d8\u06e7\u06e1\u06ec\u06d6\u06e2\u06d9\u06db"

    goto :goto_1

    :sswitch_c
    const v4, 0x450719b0

    const-string v0, "\u06e6\u06d9\u06ec\u06d6\u06ec\u06ec\u06e8\u06e0\u06d6\u06da\u06df\u06eb\u06ec\u06e2\u06eb\u06dc\u06e7\u06e4\u06e1\u06d7\u06e8\u06e0\u06eb\u06e1\u06d6\u06e0\u06e5\u06dc\u06e5\u06da\u06df\u06d6\u06e6\u06e4\u06e2\u06d6\u06d9\u06e1\u06df\u06db\u06d6\u06dc\u06d8\u06d6\u06e4\u06d7\u06e1\u06e8\u06d8\u06d6\u06eb\u06e2\u06e6\u06ec\u06e2\u06e7\u06e2\u06db\u06d9\u06df\u06ec\u06eb\u06e8"

    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_4

    goto :goto_4

    :sswitch_d
    const-string v0, "\u06e5\u06e5\u06d8\u06db\u06d6\u06d6\u06d8\u06e5\u06d9\u06d8\u06d6\u06da\u06db\u06d8\u06db\u06dc\u06d9\u06e1\u06d7\u06d8\u06e7\u06e1\u06e7\u06e6\u06d6\u06d8\u06e0\u06ec\u06ec\u06e0\u06da\u06e5\u06e6\u06dc\u06e7\u06e8\u06e8\u06dc\u06eb\u06e1\u06eb\u06e2\u06e6\u06d6\u06e0\u06d6\u06e7\u06e4\u06df\u06d6\u06e8\u06d8\u06dc\u06d8\u06d9\u06e8\u06d7\u06e8\u06df\u06db\u06d7\u06e4\u06da\u06d6\u06e2\u06d9\u06e6\u06d9\u06d6\u06e7\u06db\u06d8\u06d8\u06da\u06d6\u06e6\u06d8"

    goto :goto_0

    :sswitch_e
    const-string v0, "\u06e4\u06d9\u06d8\u06d9\u06e0\u06d9\u06e1\u06dc\u06e8\u06e6\u06d6\u06dc\u06d8\u06e1\u06e7\u06d8\u06db\u06e6\u06d6\u06d8\u06e2\u06e0\u06eb\u06dc\u06ec\u06e1\u06d8\u06e2\u06e8\u06da\u06d8\u06e4\u06e6\u06d8\u06eb\u06e2\u06eb\u06e0\u06d6\u06da\u06dc\u06e5\u06d8\u06d8\u06e7\u06e8\u06dc\u06d6\u06e6\u06e5\u06df\u06e5\u06d6\u06db\u06d7\u06d8\u06eb\u06e7\u06e1\u06d8\u06dc\u06db\u06e5\u06d8\u06e2\u06ec\u06da\u06e4\u06e4\u06eb\u06db\u06e1\u06e5\u06d8\u06e0\u06db\u06e1\u06d8\u06e8\u06e4\u06e5\u06d8\u06d7\u06d6\u06e6\u06d7\u06df\u06e5\u06d8\u06da\u06e2\u06e8\u06d8"

    goto :goto_4

    :sswitch_f
    const v5, -0xe28f96f

    const-string v0, "\u06d8\u06d6\u06d6\u06d6\u06dc\u06e5\u06db\u06e8\u06e6\u06d8\u06d7\u06e8\u06db\u06d9\u06d8\u06ec\u06da\u06d6\u06d6\u06d8\u06db\u06db\u06e4\u06e6\u06dc\u06e6\u06e5\u06d8\u06db\u06dc\u06d7\u06e8\u06db\u06e1\u06ec\u06e6\u06e4\u06e4\u06df\u06e8\u06ec\u06d7\u06e6\u06d8\u06ec\u06db\u06e0\u06e5\u06d8\u06eb\u06e8\u06ec\u06e1\u06d8\u06df\u06dc\u06dc\u06d8\u06d9\u06d6\u06d8\u06e5\u06d7\u06db\u06d8\u06d6\u06d8\u06eb\u06e2\u06eb\u06e1\u06da\u06d8\u06d8\u06e4\u06db\u06d7"

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    const-string v0, "\u06eb\u06d8\u06d8\u06d8\u06e8\u06eb\u06dc\u06d6\u06dc\u06d9\u06d9\u06e5\u06e5\u06e7\u06d9\u06e8\u06d8\u06e4\u06e2\u06ec\u06d9\u06e5\u06e5\u06e6\u06e2\u06e6\u06d8\u06db\u06e8\u06d8\u06d8\u06ec\u06df\u06d6\u06e6\u06db\u06d6\u06d9\u06e7\u06db\u06da\u06d9\u06e6\u06e4\u06d8\u06e2\u06e5\u06e2\u06e0\u06e5\u06e8\u06d7\u06df\u06db\u06e1\u06dc\u06ec\u06e8\u06d8\u06e5\u06e0\u06e5\u06d8\u06e0\u06e1\u06e6\u06d8\u06ec\u06e4\u06e7\u06e7\u06e4\u06ec\u06e7\u06e0\u06db\u06dc\u06e4"

    goto :goto_5

    :sswitch_11
    const-string v0, "\u06ec\u06df\u06eb\u06e0\u06e6\u06d8\u06e1\u06d7\u06d6\u06dc\u06d8\u06e0\u06d7\u06d9\u06e5\u06d8\u06e2\u06e5\u06e2\u06d9\u06dc\u06d9\u06e6\u06d8\u06d8\u06ec\u06e8\u06e8\u06d8\u06da\u06d6\u06e0\u06da\u06d8\u06e5\u06da\u06d9\u06e8\u06d6\u06e2\u06e0\u06e2\u06d7\u06ec\u06e1\u06e7\u06d8\u06e7\u06e0\u06e4\u06e2\u06e6\u06e6\u06d8\u06e0\u06df"

    goto :goto_5

    :sswitch_12
    const v6, -0x16fa8e8b

    const-string v0, "\u06e7\u06ec\u06e8\u06e0\u06e7\u06eb\u06d6\u06ec\u06e6\u06e0\u06eb\u06e7\u06e8\u06df\u06e8\u06d8\u06e7\u06d9\u06ec\u06e7\u06ec\u06d6\u06ec\u06e8\u06df\u06d7\u06e8\u06e8\u06db\u06e2\u06df\u06e2\u06e8\u06d6\u06e0\u06db\u06e2\u06e7\u06db\u06dc\u06d8\u06d6\u06e1\u06e5\u06e0\u06d6\u06d7\u06e7\u06e8\u06e0\u06d8\u06e8\u06df\u06d7\u06df\u06ec"

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v6

    sparse-switch v7, :sswitch_data_6

    goto :goto_6

    :sswitch_13
    const-string v0, "\u06dc\u06e6\u06e5\u06d8\u06e7\u06d9\u06dc\u06eb\u06d9\u06e0\u06df\u06e6\u06d8\u06d8\u06e2\u06d6\u06e1\u06e0\u06db\u06d8\u06d8\u06e8\u06d8\u06e2\u06e5\u06e1\u06d6\u06d8\u06e5\u06e0\u06e2\u06d8\u06e5\u06df\u06eb\u06d7\u06e8\u06e6\u06d8\u06e4\u06e8\u06e8\u06e6\u06d9\u06d9\u06e7\u06e5\u06e6\u06d8\u06da\u06e2\u06dc\u06d8\u06e6\u06e1\u06db\u06df\u06e5\u06e8\u06ec\u06e2\u06dc\u06d8\u06e4\u06df\u06d9\u06e6\u06d9\u06e5\u06e0\u06e8\u06e7\u06e7\u06e2\u06e8\u06e8\u06e0\u06e2"

    goto :goto_5

    :cond_1
    const-string v0, "\u06df\u06e4\u06db\u06e4\u06df\u06d8\u06d8\u06e7\u06e2\u06e5\u06da\u06d6\u06d8\u06d6\u06e7\u06d7\u06e4\u06e8\u06e8\u06db\u06df\u06e0\u06e5\u06d7\u06d9\u06e1\u06df\u06d6\u06d8\u06eb\u06e7\u06eb\u06d7\u06df\u06ec\u06d8\u06e5\u06e6\u06e2\u06e4\u06d6\u06d8\u06db\u06db\u06d8\u06ec\u06db\u06e1\u06d7\u06d6\u06eb\u06e1\u06e2\u06e2\u06ec\u06e7\u06e5\u06da\u06e0\u06dc\u06e6\u06e6\u06d8\u06e0\u06eb\u06e6\u06d8\u06d7\u06df\u06da\u06da\u06d6\u06eb\u06da\u06dc\u06d8\u06e7\u06e0\u06d8\u06d8\u06d8\u06e7\u06db\u06e5\u06d7\u06d6\u06d8"

    goto :goto_6

    :sswitch_14
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "\u06df\u06d7\u06ec\u06dc\u06db\u06eb\u06e5\u06df\u06da\u06dc\u06ec\u06e8\u06dc\u06e2\u06da\u06ec\u06db\u06d7\u06ec\u06e8\u06d8\u06d9\u06e2\u06e8\u06e8\u06d7\u06d7\u06da\u06e7\u06da\u06e4\u06e5\u06d8\u06d9\u06e8\u06da\u06eb\u06eb\u06db\u06eb\u06ec\u06e6\u06d8\u06db\u06ec\u06eb\u06e6\u06da\u06e8\u06d8\u06e7\u06eb\u06e8\u06d8\u06df\u06dc\u06e7\u06e5\u06e6\u06e4\u06da\u06db\u06e0\u06e1\u06d7\u06e1\u06d8"

    goto :goto_6

    :sswitch_15
    const-string v0, "\u06e0\u06d6\u06e6\u06d9\u06e4\u06db\u06d9\u06e8\u06e1\u06d8\u06d9\u06d7\u06d9\u06ec\u06d9\u06e7\u06da\u06df\u06e6\u06d8\u06d8\u06e6\u06e5\u06d8\u06df\u06e7\u06df\u06e4\u06eb\u06d6\u06d8\u06e7\u06e5\u06df\u06ec\u06d7\u06db\u06dc\u06eb\u06ec\u06da\u06d8\u06ec\u06e8\u06e4\u06e2\u06df\u06e6\u06d8\u06e0\u06d9\u06eb\u06da\u06d8\u06da\u06e8\u06d6\u06ec\u06e6\u06d6\u06e0\u06e1\u06e8\u06e8\u06e5\u06df"

    goto :goto_6

    :sswitch_16
    const-string v0, "\u06eb\u06d6\u06e4\u06d6\u06e1\u06e0\u06e0\u06e7\u06e2\u06e7\u06d8\u06d8\u06eb\u06df\u06d8\u06d8\u06dc\u06dc\u06e8\u06d8\u06e1\u06e8\u06db\u06da\u06ec\u06e5\u06e1\u06eb\u06e6\u06d8\u06e8\u06e7\u06d9\u06db\u06d8\u06e1\u06d8\u06db\u06e1\u06e4\u06eb\u06eb\u06d6\u06eb\u06e4\u06d7\u06e2\u06e6\u06d6\u06d8\u06d7\u06d8\u06d8\u06d8\u06e8\u06e2\u06d9\u06d6\u06e5\u06e6\u06e6\u06d8\u06d9\u06da\u06d7\u06e0\u06db\u06dc\u06e7\u06d8\u06e6\u06e0\u06ec\u06e2\u06dc\u06e5\u06df\u06db\u06e1\u06d8\u06d9\u06e4\u06d6\u06ec\u06e6\u06e4\u06e6\u06e2\u06e8\u06d8"

    goto :goto_4

    :sswitch_17
    const-string v0, "\u06da\u06e2\u06d9\u06da\u06e2\u06e8\u06e0\u06d6\u06d8\u06ec\u06e6\u06e2\u06da\u06e0\u06e8\u06e8\u06e6\u06d8\u06e5\u06e1\u06d8\u06e6\u06ec\u06e8\u06d9\u06d6\u06da\u06e8\u06d7\u06ec\u06e6\u06dc\u06e1\u06df\u06e1\u06da\u06da\u06da\u06d9\u06dc\u06d8\u06e0\u06d8\u06ec\u06d9"

    goto :goto_4

    :sswitch_18
    const-string v0, "\u06e2\u06e0\u06e8\u06e8\u06db\u06e5\u06d8\u06e4\u06e1\u06d8\u06d9\u06e8\u06e7\u06d8\u06e6\u06eb\u06e8\u06d8\u06db\u06e4\u06d9\u06dc\u06dc\u06da\u06e5\u06da\u06e5\u06df\u06e0\u06da\u06e4\u06e0\u06e7\u06d9\u06e1\u06e2\u06e1\u06e4\u06da\u06dc\u06d7\u06e4\u06d6\u06da\u06dc\u06e1\u06e6\u06dc\u06d8\u06e5\u06da\u06e4\u06d9\u06eb\u06d6\u06e1\u06e5\u06d9\u06d6\u06e6\u06e8\u06da\u06e8\u06eb\u06e7\u06d6\u06d8"

    goto/16 :goto_0

    :sswitch_19
    const/4 v3, 0x1

    const-string v0, "\u06e8\u06e2\u06d9\u06d9\u06eb\u06da\u06e7\u06dc\u06dc\u06da\u06db\u06dc\u06da\u06d8\u06d9\u06e5\u06d6\u06d8\u06e0\u06d8\u06d8\u06dc\u06ec\u06d9\u06d7\u06e6\u06e1\u06d8\u06d6\u06e5\u06da\u06e4\u06e8\u06ec\u06e5\u06dc\u06eb\u06e1\u06e0\u06d8\u06d8\u06d6\u06d9\u06d7\u06da\u06e2\u06e1\u06d8\u06e8\u06eb\u06e1\u06d8\u06e8\u06e1\u06e5\u06d8\u06eb\u06d7\u06d6"

    goto/16 :goto_0

    :sswitch_1a
    const-string v0, "\u06e2\u06e7\u06dc\u06d8\u06da\u06e8\u06ec\u06e7\u06d8\u06e1\u06e1\u06d9\u06e5\u06d8\u06ec\u06ec\u06e6\u06d8\u06d6\u06dc\u06d6\u06df\u06e0\u06d8\u06d8\u06ec\u06da\u06d8\u06d7\u06e2\u06d9\u06d8\u06e0\u06d8\u06d8\u06ec\u06e8\u06eb\u06e1\u06ec\u06ec\u06eb\u06d6\u06da\u06d6\u06df\u06e8\u06e6\u06d7\u06df\u06e4\u06e4\u06e5\u06d8\u06e1\u06e0\u06ec\u06e8\u06db\u06e5\u06d7\u06df\u06da\u06d7\u06e6\u06e8\u06d8\u06e6\u06df\u06df\u06e7\u06d6\u06e1\u06d8\u06e0\u06e6\u06d7\u06ec\u06db\u06d8\u06d8"

    move v1, v3

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "\u06da\u06e7\u06d8\u06d8\u06dc\u06e4\u06e7\u06db\u06ec\u06e6\u06d8\u06e7\u06d8\u06eb\u06e0\u06e8\u06e5\u06d8\u06d9\u06e2\u06e4\u06ec\u06e2\u06db\u06e1\u06dc\u06d7\u06eb\u06dc\u06e8\u06e0\u06e7\u06e1\u06e4\u06d6\u06e5\u06e4\u06d8\u06e1\u06da\u06d6\u06eb\u06df\u06e8\u06dc\u06e1\u06db\u06d8\u06d8"

    goto/16 :goto_0

    :sswitch_1c
    const-string v0, "\u06e6\u06dc\u06e6\u06e5\u06d8\u06d9\u06d7\u06d6\u06ec\u06eb\u06dc\u06e8\u06d8\u06da\u06e1\u06e6\u06d8\u06d9\u06dc\u06d7\u06db\u06e1\u06e1\u06d8\u06e1\u06e1\u06dc\u06d8\u06e2\u06eb\u06e8\u06d8\u06e5\u06e6\u06e7\u06eb\u06e6\u06d8\u06d8\u06ec\u06e6\u06d8\u06d9\u06ec\u06e6\u06d8\u06eb\u06ec\u06e4\u06e0\u06e6\u06da\u06db\u06e5\u06e5\u06da\u06e8\u06eb\u06db\u06d8\u06db\u06d9\u06e5\u06d8\u06e1\u06da\u06e6\u06e7\u06d7"

    move v1, v2

    goto/16 :goto_0

    :sswitch_1d
    const-string v0, "\u06e6\u06dc\u06e6\u06e5\u06d8\u06d9\u06d7\u06d6\u06ec\u06eb\u06dc\u06e8\u06d8\u06da\u06e1\u06e6\u06d8\u06d9\u06dc\u06d7\u06db\u06e1\u06e1\u06d8\u06e1\u06e1\u06dc\u06d8\u06e2\u06eb\u06e8\u06d8\u06e5\u06e6\u06e7\u06eb\u06e6\u06d8\u06d8\u06ec\u06e6\u06d8\u06d9\u06ec\u06e6\u06d8\u06eb\u06ec\u06e4\u06e0\u06e6\u06da\u06db\u06e5\u06e5\u06da\u06e8\u06eb\u06db\u06d8\u06db\u06d9\u06e5\u06d8\u06e1\u06da\u06e6\u06e7\u06d7"

    goto/16 :goto_0

    :sswitch_1e
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x726e808b -> :sswitch_19
        -0x69f26609 -> :sswitch_0
        -0x617cf6cd -> :sswitch_1a
        -0x44f954a7 -> :sswitch_c
        -0x22c6aca7 -> :sswitch_1e
        0x3327ccd1 -> :sswitch_1c
        0x3ac95e12 -> :sswitch_1d
        0x7dc0c437 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x33c303fe -> :sswitch_1
        -0xcdaaa3a -> :sswitch_3
        0xa1ccb9c -> :sswitch_d
        0x11ce8851 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x2e51ec86 -> :sswitch_6
        -0x158255d2 -> :sswitch_2
        -0x144cd95d -> :sswitch_4
        0x192b561b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x22b743ec -> :sswitch_9
        -0x2217855d -> :sswitch_8
        -0x18aa0cb8 -> :sswitch_7
        0x41e43371 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x6448b274 -> :sswitch_f
        -0x32b708a2 -> :sswitch_d
        0x44a66a53 -> :sswitch_17
        0x573e70ea -> :sswitch_18
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        -0x61213a62 -> :sswitch_10
        -0x381aeba2 -> :sswitch_e
        -0x29838a80 -> :sswitch_16
        0x28870d17 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        -0x5589d348 -> :sswitch_14
        -0x409c1e26 -> :sswitch_15
        0x63e8819 -> :sswitch_11
        0x6560f84 -> :sswitch_13
    .end sparse-switch
.end method

.method public static ۥ۟()Landroid/app/Activity;
    .locals 4

    const/4 v3, 0x6

    :try_start_0
    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {}, L۟/q$c;->ۥ()Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    const/16 v1, 0x9

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/util/EmptyStackException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/Throwable;

    const/16 v1, 0x17

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v2, v3, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    new-instance v0, Ljava/lang/RuntimeException;

    const/16 v1, 0x41

    new-array v1, v1, [B

    fill-array-data v1, :array_4

    new-array v2, v3, [B

    fill-array-data v2, :array_5

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :array_0
    .array-data 1
        -0x12t
        0x32t
        0x1dt
        -0x8t
        -0x76t
        -0x64t
        -0x50t
        0x79t
        0x51t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x62t
        0x57t
        0x78t
        -0x6dt
        -0x5et
        -0x4et
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x18t
        -0x17t
        -0x61t
        -0x17t
        0x3ft
        0x1bt
        -0x23t
        -0xdt
        0xft
        0x38t
        -0xdt
        -0x6bt
        0x0t
        0x30t
        0x4t
        0x3ct
        -0x3bt
        -0x65t
        0x29t
        0xat
        0xet
        0x7t
        -0xdt
    .end array-data

    :array_3
    .array-data 1
        -0x57t
        -0x76t
        -0x15t
        -0x80t
        0x49t
        0x72t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x2at
        0x22t
        0x4dt
        -0x1at
        -0x5ct
        -0x4ft
        0x57t
        0x3et
        0x46t
        -0x5t
        -0x4bt
        -0x4t
        0xbt
        0x3et
        0x4at
        -0x19t
        -0x4dt
        -0x4et
        0x1ct
        0x3ft
        0x1et
        -0x4t
        -0x52t
        -0x52t
        0x14t
        0x3at
        0x52t
        -0x2t
        -0x48t
        -0x10t
        0x59t
        0x2ct
        0x56t
        -0x5t
        -0x53t
        -0x47t
        0x59t
        0x32t
        0x4at
        -0x4et
        -0x4at
        -0x43t
        0xat
        0x7bt
        0x4dt
        -0x19t
        -0x4ft
        -0x54t
        0x16t
        0x28t
        0x5bt
        -0xat
        -0x1ft
        -0x58t
        0x16t
        0x7bt
        0x56t
        -0xdt
        -0x53t
        -0x58t
        0x59t
        0x11t
        0x68t
        -0x21t
        -0x11t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x79t
        0x5bt
        0x3et
        -0x6et
        -0x3ft
        -0x24t
    .end array-data
.end method

.method public static ۥ۟۟()Ljava/lang/ClassLoader;
    .locals 7

    const/4 v2, 0x0

    const-string v0, "\u06ec\u06db\u06df\u06d7\u06e5\u06ec\u06d6\u06e5\u06e1\u06d9\u06d7\u06e4\u06e5\u06d6\u06e8\u06d8\u06e5\u06dc\u06e6\u06da\u06e5\u06e5\u06d8\u06db\u06e5\u06e2\u06d8\u06df\u06d7\u06e8\u06d7\u06e1\u06e0\u06e6\u06dc\u06e8\u06e1\u06e8\u06da\u06e6\u06d8\u06e0\u06e6\u06d6\u06dc\u06d9\u06d7\u06d7\u06d6\u06dc\u06e5\u06e4\u06e7\u06e2\u06e6\u06e4\u06e8\u06e2\u06db\u06dc\u06d7\u06e8\u06d7\u06e1\u06dc\u06e2\u06dc\u06e6\u06d8\u06da\u06e4\u06e6\u06df\u06e1\u06d8\u06d8\u06d6\u06d6\u06ec\u06e6\u06e0\u06e0\u06da\u06eb\u06df"

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x198

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x2bb

    const/16 v4, 0x75

    xor-int/2addr v3, v4

    xor-int/lit8 v3, v3, 0x34

    const/16 v4, 0x32c

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x355

    const/16 v4, 0x27

    const v5, 0x67705d8b

    xor-int/2addr v3, v4

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, L۟/l3;->ۥ۟:Ljava/lang/ClassLoader;

    const-string v0, "\u06e7\u06e6\u06d8\u06d8\u06e0\u06d9\u06dc\u06e4\u06ec\u06e8\u06dc\u06d8\u06d7\u06da\u06df\u06db\u06ec\u06e5\u06eb\u06d6\u06e1\u06ec\u06e1\u06da\u06dc\u06d8\u06d7\u06ec\u06e8\u06d9\u06e8\u06e0\u06e4\u06d7\u06e5\u06da\u06e5\u06d7\u06df\u06dc\u06e7\u06d8\u06e2\u06d8\u06e1\u06df\u06eb\u06df\u06d7\u06e1\u06da\u06da\u06e0\u06e8\u06d8\u06ec\u06d9\u06e5"

    goto :goto_0

    :sswitch_1
    const v3, -0x41e3cb3a

    const-string v0, "\u06db\u06da\u06e5\u06e6\u06eb\u06e7\u06e2\u06e1\u06d6\u06d8\u06e7\u06e6\u06e0\u06da\u06e8\u06d9\u06e5\u06e0\u06e8\u06d9\u06dc\u06e7\u06df\u06dc\u06e4\u06d8\u06e2\u06d8\u06e6\u06eb\u06d9\u06d6\u06dc\u06e2\u06e6\u06d6\u06e8\u06d8\u06d6\u06e5\u06dc\u06e4\u06db\u06d8"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    const-string v0, "\u06d6\u06e1\u06ec\u06e1\u06db\u06d6\u06d8\u06e1\u06e6\u06dc\u06d8\u06dc\u06dc\u06d8\u06d8\u06e2\u06eb\u06e6\u06db\u06d9\u06d8\u06d8\u06db\u06e8\u06d6\u06d8\u06d8\u06d9\u06d8\u06d7\u06e5\u06e2\u06ec\u06e6\u06e2\u06e6\u06e1\u06e7\u06d8\u06d9\u06e6\u06dc\u06d8\u06eb\u06d9\u06e8\u06d8\u06d9\u06e1\u06e1\u06d8\u06e6\u06d9\u06da\u06e1\u06e1\u06e6\u06d8\u06d7\u06d6\u06d8\u06e8\u06d8\u06e7\u06e8\u06db\u06da\u06d9\u06df\u06dc\u06e0\u06e5\u06ec\u06d7\u06e8\u06e2\u06d7\u06d8\u06d8\u06e5\u06e7\u06db\u06db\u06db\u06eb\u06e2\u06e5\u06e1\u06df\u06e5\u06e1\u06d8"

    goto :goto_1

    :sswitch_3
    const-string v0, "\u06dc\u06e5\u06e6\u06d8\u06d9\u06e4\u06df\u06df\u06ec\u06db\u06ec\u06d8\u06e8\u06d8\u06e0\u06d7\u06ec\u06d9\u06e0\u06df\u06d7\u06da\u06e0\u06e0\u06e1\u06d6\u06d8\u06e8\u06e6\u06eb\u06e2\u06e7\u06dc\u06d8\u06e5\u06df\u06eb\u06e6\u06df\u06df\u06e5\u06e6\u06e5\u06e4\u06e4\u06e5\u06d8\u06eb\u06e7\u06e2"

    goto :goto_1

    :sswitch_4
    const v4, 0x55383649

    const-string v0, "\u06e0\u06d7\u06e5\u06d8\u06e8\u06dc\u06e4\u06e1\u06eb\u06df\u06e4\u06e8\u06e0\u06e1\u06e7\u06d8\u06e0\u06d9\u06eb\u06d8\u06da\u06e1\u06d8\u06dc\u06eb\u06d8\u06e4\u06ec\u06da\u06ec\u06dc\u06eb\u06ec\u06db\u06d7\u06dc\u06eb\u06e7\u06ec\u06e8\u06d8\u06e6\u06d8\u06e6\u06e5\u06e2\u06df\u06e6\u06eb\u06e5\u06e1\u06e2\u06e6\u06e4\u06e0\u06dc\u06da\u06d9\u06e1\u06d9\u06e4\u06dc\u06e2\u06e4\u06e5\u06e5\u06da\u06e8\u06d8\u06e6\u06d7\u06e2\u06dc\u06e2\u06dc\u06db\u06e8\u06e1\u06d9\u06e1\u06e5\u06e5\u06e2\u06ec"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const-string v0, "\u06e0\u06e1\u06e2\u06d7\u06d6\u06dc\u06d8\u06e4\u06d8\u06e0\u06df\u06db\u06e7\u06e6\u06e6\u06d8\u06eb\u06e6\u06e1\u06d8\u06db\u06e1\u06e7\u06dc\u06d8\u06e6\u06e7\u06dc\u06d8\u06dc\u06d7\u06e1\u06d8\u06d6\u06e0\u06d7\u06df\u06da\u06d6\u06e2\u06da\u06e4\u06df\u06e8\u06dc\u06e5\u06d6\u06e7\u06d8"

    goto :goto_2

    :sswitch_6
    const-string v0, "\u06e2\u06d9\u06e4\u06e7\u06dc\u06ec\u06e1\u06eb\u06e6\u06e0\u06dc\u06e4\u06ec\u06ec\u06e1\u06d8\u06e2\u06dc\u06e1\u06d8\u06db\u06d7\u06d6\u06e2\u06e4\u06d8\u06d8\u06ec\u06d8\u06e7\u06d8\u06d7\u06d8\u06e5\u06d8\u06e2\u06e8\u06dc\u06d8\u06da\u06df\u06da\u06eb\u06e2\u06d8\u06d8\u06e8\u06d9\u06da\u06dc\u06d9\u06e5\u06ec\u06d7\u06ec\u06eb\u06e7\u06d8\u06d8\u06d7\u06d6\u06eb\u06e7\u06df\u06e8\u06e5\u06d8\u06eb\u06e0\u06e0\u06d8\u06d8"

    goto :goto_2

    :sswitch_7
    const v5, -0x2736ab67

    const-string v0, "\u06d8\u06e8\u06df\u06e8\u06d6\u06d8\u06eb\u06db\u06e5\u06d8\u06e7\u06d7\u06dc\u06d8\u06da\u06e7\u06ec\u06e6\u06da\u06e1\u06e0\u06dc\u06eb\u06e7\u06d6\u06d8\u06d8\u06ec\u06e4\u06d9\u06e4\u06d7\u06ec\u06e0\u06e8\u06eb\u06d8\u06df\u06e1\u06e7\u06d8\u06da\u06db\u06dc\u06d8\u06e2\u06e2\u06d9\u06db\u06d8\u06e8\u06ec\u06dc\u06ec\u06e4\u06e5\u06d8\u06e0\u06dc\u06d6\u06eb\u06e1\u06d8\u06e0\u06df\u06e6\u06d8"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_0

    const-string v0, "\u06e1\u06e8\u06e1\u06d8\u06e6\u06db\u06d8\u06d8\u06e7\u06e4\u06d9\u06da\u06d9\u06ec\u06e2\u06df\u06da\u06eb\u06db\u06e5\u06e7\u06eb\u06e4\u06e6\u06d8\u06db\u06d8\u06dc\u06d8\u06d7\u06e1\u06e1\u06d8\u06e1\u06d8\u06e8\u06d8\u06e7\u06e6\u06e8\u06d8\u06e0\u06e8\u06e6\u06d8\u06e5\u06db\u06da\u06d8\u06d8\u06d6\u06e7\u06e0\u06d7\u06e1\u06e5\u06e4\u06da\u06d9"

    goto :goto_3

    :cond_0
    const-string v0, "\u06d7\u06ec\u06e2\u06ec\u06e0\u06e6\u06d8\u06e0\u06eb\u06df\u06e8\u06d9\u06e8\u06dc\u06e0\u06e4\u06db\u06e4\u06eb\u06e2\u06d9\u06d6\u06d8\u06e5\u06dc\u06e0\u06db\u06e6\u06da\u06e2\u06e6\u06ec\u06e4\u06eb\u06d7\u06df\u06e2\u06db\u06e6\u06d6\u06df\u06d8\u06d8\u06e4\u06d8\u06e0\u06eb\u06d9\u06e6\u06d8\u06eb\u06d7\u06d8\u06d8\u06e2\u06d7\u06d6\u06d8\u06e8\u06e4\u06e1\u06da\u06dc\u06dc\u06ec\u06e5\u06e1\u06e2\u06db\u06e6\u06e5\u06da\u06e6\u06db\u06d8"

    goto :goto_3

    :sswitch_9
    const-string v0, "\u06db\u06df\u06d9\u06d6\u06df\u06db\u06df\u06d7\u06e5\u06d8\u06e5\u06df\u06e5\u06e6\u06da\u06df\u06d8\u06d8\u06d6\u06d8\u06da\u06e4\u06df\u06db\u06ec\u06e4\u06ec\u06e8\u06e1\u06db\u06e6\u06e7\u06e1\u06e7\u06eb\u06e5\u06e7\u06e6\u06d8\u06d7\u06df\u06e5\u06e0\u06ec\u06df\u06df\u06db\u06e5\u06d8\u06dc\u06ec\u06e2\u06df\u06e1\u06e4\u06d8\u06d7\u06e2\u06d7\u06e4\u06df\u06e7\u06e5\u06eb\u06e8\u06d9\u06eb\u06e7\u06e0\u06e7\u06df\u06eb\u06e8\u06e5\u06e7\u06d8"

    goto :goto_3

    :sswitch_a
    const-string v0, "\u06e2\u06d7\u06d7\u06d6\u06e5\u06e1\u06d8\u06dc\u06e7\u06ec\u06db\u06dc\u06dc\u06eb\u06d9\u06ec\u06e7\u06e1\u06eb\u06df\u06dc\u06eb\u06dc\u06e5\u06e6\u06d8\u06eb\u06e2\u06e7\u06e7\u06e0\u06da\u06e6\u06e4\u06dc\u06d8\u06d6\u06dc\u06e6\u06d8\u06dc\u06eb\u06e6\u06d9\u06ec\u06e6\u06d9\u06da\u06e6\u06da\u06da\u06e6\u06d8\u06eb\u06e5\u06ec\u06e7\u06e1\u06e4"

    goto :goto_2

    :sswitch_b
    const-string v0, "\u06e1\u06e0\u06db\u06d8\u06e8\u06eb\u06e4\u06e8\u06d8\u06e0\u06d8\u06e1\u06d8\u06d8\u06e5\u06e5\u06d8\u06d9\u06da\u06e7\u06d8\u06e6\u06e4\u06d9\u06db\u06dc\u06d8\u06d6\u06ec\u06e5\u06d8\u06dc\u06e8\u06e1\u06d8\u06e4\u06dc\u06e6\u06da\u06e1\u06dc\u06dc\u06e5\u06e6\u06d9\u06dc\u06e5\u06eb\u06e8\u06d8\u06df\u06e8\u06d6\u06e6\u06e6\u06e2\u06db\u06db\u06dc\u06ec\u06e4\u06e6\u06d8\u06e0\u06d7\u06d7\u06df\u06e5\u06e1\u06d8"

    goto :goto_1

    :sswitch_c
    const-string v0, "\u06d8\u06e2\u06df\u06e2\u06ec\u06d9\u06ec\u06e5\u06d9\u06da\u06e6\u06e2\u06d6\u06eb\u06d7\u06eb\u06da\u06e6\u06d8\u06e7\u06d8\u06d6\u06d8\u06e7\u06e5\u06e6\u06d7\u06d6\u06d6\u06d8\u06e1\u06df\u06e6\u06d8\u06da\u06eb\u06e1\u06d8\u06e8\u06d6\u06dc\u06e5\u06d6\u06d8\u06d8\u06dc\u06eb\u06e0"

    goto :goto_0

    :sswitch_d
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v3, 0x6

    new-array v3, v3, [B

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const-string v0, "\u06d9\u06e5\u06dc\u06d8\u06df\u06dc\u06d8\u06d8\u06d7\u06d7\u06e2\u06e5\u06d7\u06e1\u06e2\u06d8\u06e6\u06ec\u06db\u06d8\u06e8\u06e8\u06e4\u06e0\u06dc\u06ec\u06e7\u06d7\u06e0\u06e6\u06e0\u06e6\u06da\u06db\u06e6\u06db\u06e0\u06d6\u06d8\u06e5\u06e4\u06db\u06e4\u06e0\u06e2\u06e5\u06d6\u06db\u06db\u06dc\u06d6\u06d9\u06d8\u06e6\u06d7"

    goto/16 :goto_0

    :sswitch_e
    throw v2

    :sswitch_f
    const-string v0, "\u06df\u06e0\u06e2\u06dc\u06d6\u06e0\u06e1\u06da\u06e4\u06eb\u06d7\u06dc\u06db\u06e7\u06ec\u06ec\u06db\u06d8\u06db\u06e2\u06e0\u06df\u06e1\u06e4\u06e4\u06e5\u06d8\u06dc\u06da\u06e1\u06e1\u06e5\u06da\u06e5\u06e1\u06e5\u06e8\u06db\u06e6\u06e8\u06d9\u06da\u06db\u06e2\u06da\u06e2\u06eb\u06d9\u06e0\u06ec\u06dc\u06d8\u06db\u06db\u06d6\u06d6\u06da\u06d7\u06d9\u06d7\u06d7\u06e0\u06e8\u06e6\u06d8\u06ec\u06ec\u06e5\u06d8\u06ec\u06e8\u06d7\u06d8\u06ec\u06df\u06d7\u06dc\u06d8\u06d8\u06d7\u06e5\u06ec"

    goto/16 :goto_0

    :sswitch_10
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x2fd4f0bf -> :sswitch_d
        -0x4ec25b7 -> :sswitch_e
        -0x76a209 -> :sswitch_0
        0x53ab5bda -> :sswitch_10
        0x596887ac -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x62f87325 -> :sswitch_2
        0x123794f7 -> :sswitch_c
        0x18e17100 -> :sswitch_f
        0x55f6b1c7 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x651c6c43 -> :sswitch_b
        -0x60ace784 -> :sswitch_7
        -0x3044586b -> :sswitch_5
        -0x9c75948 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x41cc73be -> :sswitch_6
        -0x2cafff96 -> :sswitch_9
        -0x11250afc -> :sswitch_a
        -0xa99c350 -> :sswitch_8
    .end sparse-switch

    :array_0
    .array-data 1
        -0x4et
        0xat
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x2ft
        0x66t
        0x37t
        0x5at
        0x4t
        -0x36t
    .end array-data
.end method

.method public static ۥ۟۠()Landroid/content/Context;
    .locals 7

    const/4 v2, 0x0

    const-string v0, "\u06d6\u06d6\u06e7\u06d9\u06eb\u06eb\u06da\u06d7\u06d8\u06d8\u06dc\u06eb\u06d8\u06d8\u06dc\u06da\u06d6\u06d8\u06ec\u06eb\u06e6\u06d6\u06da\u06e6\u06d7\u06e0\u06e7\u06d9\u06e0\u06d6\u06db\u06e0\u06d8\u06e1\u06e7\u06e5\u06d6\u06df\u06d7\u06e8\u06d8\u06d8\u06d8\u06d6\u06d9\u06dc\u06d8\u06db\u06e6\u06e8\u06e4\u06e8\u06e0\u06e0\u06d7\u06e7\u06e1\u06e7\u06d8\u06e4\u06d8\u06e5\u06d8\u06d8\u06e1\u06d9\u06d6\u06d8\u06d6\u06d8\u06e0\u06ec\u06e7\u06e0\u06db\u06e1\u06eb\u06d8\u06eb"

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x6e

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0xd5

    const/16 v4, 0x1c1

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x363

    const/16 v4, 0x284

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x2c7

    const/16 v4, 0x1a

    const v5, -0x690adf2a

    xor-int/2addr v3, v4

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, L۟/l3;->ۥ:Landroid/content/Context;

    const-string v0, "\u06e5\u06dc\u06e8\u06d8\u06da\u06ec\u06e4\u06da\u06db\u06eb\u06d8\u06e8\u06eb\u06e2\u06df\u06d9\u06dc\u06d6\u06d8\u06df\u06e7\u06ec\u06d6\u06e5\u06e8\u06ec\u06e4\u06e2\u06da\u06db\u06e5\u06e2\u06d7\u06dc\u06e4\u06d9\u06d7\u06e1\u06e8\u06da\u06e2\u06e0\u06e1\u06e8\u06eb\u06e2\u06e8\u06dc\u06d8\u06db\u06df\u06e6\u06d8\u06eb\u06e6\u06e2\u06dc\u06d7\u06e4\u06e4\u06dc\u06e8\u06d8\u06ec\u06ec\u06eb"

    goto :goto_0

    :sswitch_1
    const v3, 0x51703813

    const-string v0, "\u06d6\u06db\u06e1\u06e7\u06eb\u06db\u06e1\u06e1\u06e6\u06e0\u06e7\u06e5\u06d8\u06e0\u06e5\u06df\u06d8\u06d9\u06e6\u06d8\u06eb\u06e5\u06e2\u06df\u06dc\u06d8\u06d6\u06e0\u06e2\u06dc\u06d9\u06e6\u06d8\u06e2\u06d7\u06e4\u06d7\u06e7\u06da\u06ec\u06e6\u06df\u06df\u06d6\u06e5\u06dc\u06d7\u06d8\u06d8\u06d6\u06df\u06e8\u06df\u06d7\u06db\u06e0\u06e4\u06d9"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    const-string v0, "\u06da\u06dc\u06e5\u06d8\u06e0\u06d9\u06db\u06d7\u06d7\u06e8\u06d6\u06d6\u06e2\u06e7\u06eb\u06e6\u06e8\u06df\u06d7\u06df\u06e1\u06e1\u06e4\u06d9\u06e8\u06da\u06e8\u06e1\u06d8\u06d7\u06d6\u06ec\u06e7\u06e7\u06d7\u06df\u06d7\u06ec\u06db\u06e5\u06d8\u06e1\u06ec\u06e0\u06dc\u06e5\u06db\u06d9\u06db\u06e5\u06e7\u06e5\u06e7\u06d8\u06da\u06eb\u06e5\u06d9\u06da\u06d6\u06d8\u06d9\u06ec\u06df\u06e8\u06e8\u06db\u06e4\u06d7\u06df\u06ec\u06db\u06e1\u06d8\u06e7\u06d7\u06e8\u06d8\u06e5\u06e0\u06e1\u06d8\u06e8\u06e1\u06e6\u06d8\u06e5\u06d7\u06da"

    goto :goto_1

    :sswitch_3
    const-string v0, "\u06e6\u06da\u06d6\u06dc\u06db\u06e8\u06d9\u06e5\u06e1\u06d8\u06e4\u06e1\u06df\u06e5\u06e2\u06e6\u06e8\u06e5\u06e0\u06e5\u06e6\u06d8\u06e7\u06e2\u06e2\u06d7\u06da\u06d9\u06db\u06da\u06e1\u06e2\u06d6\u06d8\u06d8\u06d7\u06e6\u06e8\u06d8\u06d8\u06d7\u06e6\u06d8\u06d8\u06e1\u06d8\u06d8\u06e1\u06df\u06dc\u06d8\u06e6\u06da\u06d7\u06da\u06d7\u06e1\u06d8\u06e6\u06e6\u06da\u06d9\u06e7\u06df\u06e4\u06d7\u06d7\u06d7\u06d7\u06dc"

    goto :goto_1

    :sswitch_4
    const v4, -0x359997b4    # -3774995.0f

    const-string v0, "\u06e0\u06e5\u06d6\u06d8\u06e0\u06db\u06d9\u06db\u06d9\u06d6\u06e8\u06dc\u06d7\u06e5\u06e8\u06e5\u06d8\u06e5\u06e1\u06db\u06e5\u06ec\u06d7\u06e2\u06d9\u06d6\u06d8\u06e0\u06e5\u06e0\u06db\u06e7\u06dc\u06e0\u06e6\u06e5\u06e1\u06e6\u06d8\u06d8\u06eb\u06ec\u06d6\u06d8\u06d8\u06e8\u06e0\u06e8\u06eb\u06e4\u06ec\u06e5\u06d6\u06d8\u06d8\u06e8\u06d7\u06d7\u06e5\u06eb\u06db\u06eb\u06e6\u06e7\u06d7\u06eb\u06d7\u06d9\u06e6\u06dc\u06df\u06e6\u06e4\u06da\u06e2\u06d8\u06d6\u06d8"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const-string v0, "\u06da\u06e0\u06d6\u06e6\u06e0\u06db\u06ec\u06d9\u06e1\u06d6\u06d7\u06db\u06e0\u06d7\u06ec\u06e1\u06df\u06df\u06e6\u06da\u06e7\u06d8\u06e5\u06e8\u06e6\u06e6\u06d6\u06d8\u06d6\u06e4\u06e2\u06df\u06eb\u06e6\u06d8\u06df\u06e2\u06e2\u06d6\u06e8\u06d7\u06e6\u06e2\u06df\u06d7\u06db\u06e6\u06d8\u06e5\u06e8\u06dc\u06e1\u06e8\u06d6\u06df\u06df\u06e5\u06ec\u06e2\u06d6\u06e4\u06e0\u06ec\u06e4\u06df\u06e5\u06d8"

    goto :goto_2

    :sswitch_6
    const-string v0, "\u06dc\u06e2\u06ec\u06d8\u06e6\u06e5\u06d8\u06e6\u06e5\u06d6\u06d8\u06eb\u06dc\u06d7\u06df\u06e6\u06e0\u06ec\u06ec\u06e5\u06d8\u06e8\u06ec\u06e5\u06dc\u06eb\u06d7\u06e2\u06e5\u06db\u06d9\u06db\u06da\u06e1\u06df\u06d8\u06d8\u06e5\u06d8\u06e5\u06d9\u06e5\u06dc\u06e7\u06e1\u06df\u06ec\u06d7\u06d7\u06e1\u06da\u06e4\u06df\u06d7\u06e2\u06e5\u06e8\u06e1\u06d8\u06da\u06e8\u06d7\u06d6\u06da\u06dc\u06d9\u06dc\u06ec"

    goto :goto_2

    :sswitch_7
    const v5, 0x39ad0971

    const-string v0, "\u06e5\u06e0\u06db\u06dc\u06d8\u06d6\u06d8\u06d9\u06d6\u06e5\u06eb\u06ec\u06e1\u06d8\u06eb\u06ec\u06db\u06ec\u06d9\u06e5\u06db\u06ec\u06e7\u06e1\u06eb\u06e2\u06eb\u06db\u06d8\u06e0\u06e2\u06d8\u06d8\u06ec\u06e5\u06e4\u06e4\u06da\u06d8\u06d8\u06eb\u06da\u06d8\u06d8\u06d9\u06d9\u06d8\u06e5\u06d8\u06e5"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    const-string v0, "\u06e8\u06e8\u06e8\u06eb\u06da\u06d8\u06e8\u06eb\u06e1\u06e2\u06e4\u06e5\u06d8\u06e0\u06e5\u06df\u06d7\u06ec\u06dc\u06d8\u06df\u06d9\u06e4\u06d9\u06eb\u06e2\u06e8\u06e8\u06e8\u06d8\u06d7\u06e4\u06e6\u06db\u06e6\u06d8\u06df\u06e6\u06dc\u06db\u06d8\u06d8\u06e7\u06eb\u06dc\u06db\u06e5\u06ec\u06e2\u06dc\u06db\u06dc\u06dc\u06d8\u06df\u06e8\u06e8\u06d8\u06d7\u06db\u06e8\u06d8\u06e5\u06e1\u06e5\u06da\u06e0\u06d8\u06d9\u06d7\u06da\u06e0\u06d6\u06dc\u06d8\u06e7\u06e2\u06d7"

    goto :goto_2

    :cond_0
    const-string v0, "\u06eb\u06df\u06ec\u06d8\u06e1\u06e6\u06d8\u06e8\u06e2\u06e7\u06da\u06d8\u06da\u06e1\u06d9\u06d6\u06d9\u06e1\u06e8\u06d8\u06eb\u06e6\u06e8\u06d8\u06dc\u06e7\u06df\u06dc\u06e6\u06e0\u06db\u06dc\u06db\u06e4\u06da\u06e1\u06e7\u06e2\u06e6\u06e8\u06df\u06dc\u06e8\u06e2\u06e2\u06da\u06e5\u06d8\u06e4\u06d6\u06e6\u06e0\u06e1\u06e5\u06e0\u06e5\u06e1\u06da\u06dc\u06df\u06e1\u06e0\u06d6\u06e2\u06e0"

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_0

    const-string v0, "\u06e7\u06da\u06e6\u06d8\u06e6\u06e8\u06eb\u06d7\u06e7\u06eb\u06d7\u06e2\u06d7\u06db\u06da\u06e7\u06d7\u06e0\u06e0\u06e5\u06dc\u06d8\u06ec\u06e6\u06ec\u06e1\u06e1\u06e0\u06d8\u06e7\u06ec\u06eb\u06e5\u06e5\u06d8\u06e0\u06e7\u06e8\u06d8\u06d6\u06df\u06da\u06db\u06df\u06eb\u06e0\u06d9\u06e4"

    goto :goto_3

    :sswitch_a
    const-string v0, "\u06df\u06d6\u06d9\u06e8\u06e2\u06d9\u06e5\u06e7\u06e1\u06e5\u06d9\u06e5\u06d9\u06e5\u06d8\u06e2\u06eb\u06e0\u06db\u06e5\u06e8\u06df\u06d9\u06d8\u06d9\u06e6\u06d8\u06d8\u06e0\u06e1\u06e5\u06da\u06dc\u06d8\u06d6\u06e8\u06e4\u06e2\u06d8\u06eb\u06e2\u06e8\u06d8\u06e1\u06e7\u06e1\u06e6\u06eb\u06e0\u06e2\u06e0\u06da\u06e5\u06e8\u06dc\u06d7\u06ec\u06e7\u06ec\u06e1\u06dc\u06dc\u06d6\u06e8\u06d8\u06d9\u06ec\u06d8\u06d8\u06e2\u06e1\u06da\u06dc\u06e5\u06dc\u06d7\u06e5\u06e1\u06d8\u06e4\u06d6\u06d7\u06db\u06e6\u06e5"

    goto :goto_3

    :sswitch_b
    const-string v0, "\u06e5\u06e6\u06d7\u06da\u06d7\u06d6\u06d8\u06ec\u06e2\u06d8\u06d6\u06e5\u06e5\u06df\u06e1\u06eb\u06eb\u06e5\u06e1\u06ec\u06eb\u06e7\u06df\u06e8\u06ec\u06e6\u06e0\u06e5\u06d8\u06e5\u06e0\u06e4\u06e2\u06db\u06e1\u06db\u06db\u06d9\u06e7\u06d6\u06e2\u06db\u06e0\u06e1\u06e6\u06d8\u06ec\u06db\u06e6\u06d8\u06e4\u06e4\u06eb\u06e4\u06d6\u06d7"

    goto :goto_1

    :sswitch_c
    const-string v0, "\u06db\u06d7\u06d9\u06da\u06e8\u06e2\u06d7\u06d7\u06dc\u06d8\u06e5\u06d8\u06ec\u06d8\u06e8\u06d9\u06e7\u06eb\u06d6\u06d8\u06d6\u06d7\u06e7\u06d6\u06e5\u06dc\u06d7\u06e6\u06e4\u06e7\u06df\u06dc\u06e1\u06e7\u06d6\u06d8\u06e0\u06ec\u06d7\u06e1\u06e2\u06e5\u06df\u06e1\u06d7\u06df\u06dc\u06dc"

    goto :goto_0

    :sswitch_d
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v3, 0x6

    new-array v3, v3, [B

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const-string v0, "\u06e4\u06df\u06e5\u06d8\u06db\u06e7\u06d7\u06e0\u06d6\u06d8\u06d8\u06d7\u06db\u06db\u06d7\u06df\u06dc\u06d8\u06db\u06d6\u06e4\u06ec\u06d7\u06d8\u06d8\u06ec\u06eb\u06dc\u06d8\u06e8\u06df\u06e0\u06eb\u06e4\u06dc\u06d8\u06e0\u06d7\u06d8\u06d8\u06e1\u06e5\u06dc\u06d6\u06e7\u06df\u06d9\u06d6\u06ec\u06e4\u06d8\u06d8\u06d8\u06e4\u06da\u06df\u06e5\u06d6\u06df\u06da\u06d6\u06eb\u06e0\u06da\u06dc\u06d8\u06e5\u06e6\u06df\u06df\u06d7\u06e1\u06d8\u06e6\u06da\u06dc\u06e8\u06d7\u06ec\u06ec\u06d9\u06e6\u06e1\u06db\u06e2\u06e2\u06db\u06d6\u06d8\u06e0\u06e7\u06dc"

    goto/16 :goto_0

    :sswitch_e
    throw v2

    :sswitch_f
    const-string v0, "\u06ec\u06dc\u06d8\u06e5\u06e4\u06d6\u06da\u06e8\u06e5\u06d8\u06e1\u06e8\u06e8\u06d8\u06ec\u06da\u06eb\u06e0\u06df\u06e1\u06db\u06dc\u06e1\u06e8\u06ec\u06e1\u06d8\u06e7\u06ec\u06e0\u06df\u06df\u06eb\u06e5\u06eb\u06e5\u06e8\u06d7\u06e0\u06d7\u06e1\u06d8\u06eb\u06e8\u06dc\u06d8\u06e7\u06e2\u06dc\u06da\u06e8\u06d6\u06dc\u06d9\u06dc\u06d8\u06e5\u06df"

    goto/16 :goto_0

    :sswitch_10
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x7d2886e8 -> :sswitch_0
        0x4357da9c -> :sswitch_e
        0x47d646dc -> :sswitch_10
        0x5a15f986 -> :sswitch_d
        0x7c9c28d8 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x465cec41 -> :sswitch_c
        0x17f47e52 -> :sswitch_2
        0x1d581562 -> :sswitch_f
        0x49c45335 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x2a8f3098 -> :sswitch_7
        -0x2097f81e -> :sswitch_5
        -0x185a2b6d -> :sswitch_b
        0x3868c505 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x5333847e -> :sswitch_6
        -0x3e7ee55a -> :sswitch_8
        -0x29f4e42d -> :sswitch_9
        -0x26c3d212 -> :sswitch_a
    .end sparse-switch

    :array_0
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    :array_1
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥ۟ۡ()Ljava/lang/String;
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06eb\u06d6\u06d6\u06e7\u06eb\u06e8\u06d7\u06e7\u06d9\u06e7\u06e6\u06e4\u06eb\u06e0\u06ec\u06e8\u06e5\u06e2\u06e5\u06ec\u06e1\u06db\u06dc\u06e1\u06d8\u06db\u06db\u06eb\u06df\u06d9\u06d7\u06e4\u06e2\u06e5\u06d8\u06d8\u06e6\u06df\u06e4\u06d7\u06e0\u06db\u06db\u06da\u06e5\u06d7\u06e1"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0x247

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x136

    const/16 v3, 0x3e2

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x352

    const/16 v3, 0x32

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x227

    const/16 v3, 0x126

    const v4, 0x4de6b6c9    # 4.83842336E8f

    xor-int/2addr v2, v3

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v0, "\u06e4\u06d6\u06d6\u06d8\u06e8\u06d9\u06e2\u06d7\u06d6\u06e7\u06dc\u06eb\u06e8\u06ec\u06e4\u06e4\u06e1\u06e8\u06e1\u06e2\u06e0\u06e6\u06d8\u06d8\u06e4\u06ec\u06e0\u06df\u06d8\u06dc\u06da\u06dc\u06da\u06d9\u06e6\u06e1\u06e0\u06eb\u06dc\u06d9\u06df\u06d7\u06e6\u06ec\u06ec\u06e1\u06e8\u06d8\u06db\u06d9\u06dc\u06d9\u06e8\u06e0\u06e1\u06eb\u06d9\u06e8\u06d7\u06ec\u06ec\u06e5\u06d8\u06d9\u06e5\u06ec\u06e7\u06e2\u06d6\u06d8\u06e7\u06db\u06dc\u06d8\u06ec\u06e7\u06e5\u06eb\u06e7\u06d8\u06e5\u06eb\u06dc\u06ec\u06e5\u06e7\u06d8"

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x12

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06d8\u06e1\u06e4\u06e0\u06e6\u06e2\u06da\u06e7\u06ec\u06e5\u06da\u06ec\u06e2\u06e8\u06e5\u06e2\u06dc\u06ec\u06e4\u06e6\u06eb\u06e5\u06df\u06e6\u06e8\u06db\u06df\u06e8\u06e1\u06d8\u06e1\u06dc\u06d6\u06e0\u06dc\u06d8\u06e1\u06e0\u06da\u06e6\u06e1\u06e8\u06d8\u06e0\u06da\u06d8\u06e6\u06e6\u06e0\u06d8\u06df\u06dc\u06d8\u06da\u06d6\u06e5\u06e4\u06e7\u06e2\u06e5\u06dc\u06d8\u06e6\u06e1\u06d7\u06e6\u06d7\u06df\u06eb\u06eb\u06dc\u06d8\u06dc\u06dc\u06da\u06e8\u06e0\u06df\u06df\u06e7\u06dc\u06d8\u06e2\u06e1\u06e1"

    goto :goto_0

    :sswitch_2
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x8975126 -> :sswitch_1
        0x15ac44b8 -> :sswitch_0
        0x40e192bb -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x7et
        -0x21t
        0x18t
        0x50t
        -0x37t
        0x7bt
        0x69t
        -0x2at
        0x9t
        0x4dt
        -0x3ft
        0x7bt
        0x7ct
        -0x6et
        0x42t
        0x2dt
        -0x72t
        0x3ft
    .end array-data

    nop

    :array_1
    .array-data 1
        0x19t
        -0x46t
        0x6ct
        0x3t
        -0x60t
        0x16t
    .end array-data
.end method

.method public static ۥ۟ۢ()Ljava/lang/String;
    .locals 7

    const/4 v2, 0x0

    const-string v0, "\u06ec\u06df\u06d9\u06e1\u06d8\u06d9\u06e4\u06e7\u06d7\u06e5\u06e8\u06e8\u06d8\u06da\u06e7\u06d6\u06dc\u06db\u06df\u06e0\u06e7\u06e2\u06d7\u06e4\u06e1\u06d8\u06e1\u06dc\u06e8\u06e5\u06eb\u06e6\u06e6\u06d7\u06da\u06e7\u06e7\u06e5\u06d8\u06e2\u06eb\u06d7\u06e8\u06ec\u06eb\u06da\u06dc\u06d6\u06da\u06df\u06eb\u06e7\u06e0\u06e0\u06e5\u06e5\u06d6\u06d8\u06e4\u06e5\u06e8\u06d8\u06e1\u06db\u06df\u06d7\u06e5\u06ec"

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x1d5

    xor-int/2addr v3, v4

    xor-int/lit8 v3, v3, 0x1a

    const/16 v4, 0x3e2

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0xda

    const/16 v4, 0x18d

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0xb7

    const/16 v4, 0x18

    const v5, 0x531ff51c

    xor-int/2addr v3, v4

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, L۟/l3;->ۥ۟۟:Ljava/lang/String;

    const-string v0, "\u06da\u06e6\u06eb\u06d6\u06dc\u06d9\u06d6\u06e1\u06e4\u06e6\u06ec\u06dc\u06d8\u06d6\u06dc\u06ec\u06d8\u06dc\u06e2\u06da\u06e1\u06e7\u06d8\u06d9\u06d7\u06e5\u06e7\u06eb\u06eb\u06e2\u06d6\u06e5\u06d8\u06e0\u06d8\u06ec\u06da\u06d7\u06e5\u06dc\u06da\u06d7\u06db\u06e8\u06ec\u06d7\u06d6\u06dc\u06d8\u06da\u06e7\u06d8\u06d8\u06d7\u06db\u06e2\u06e6\u06e2\u06d7\u06e6\u06df\u06e2\u06e8\u06e1\u06d8\u06e1\u06e6\u06eb\u06da\u06df\u06d9\u06d9\u06da\u06dc\u06d7\u06d8\u06e0\u06d7\u06e8\u06e8\u06df\u06e4\u06d8\u06df\u06e8\u06e0"

    goto :goto_0

    :sswitch_1
    const v3, 0x42b4fdf8

    const-string v0, "\u06e0\u06e0\u06e1\u06d8\u06d8\u06e1\u06d8\u06e5\u06e6\u06d8\u06e7\u06e8\u06d7\u06d8\u06e8\u06e1\u06df\u06d7\u06e5\u06d8\u06ec\u06e1\u06d6\u06df\u06e0\u06d8\u06e5\u06e6\u06e7\u06d8\u06ec\u06eb\u06dc\u06d8\u06e4\u06e0\u06d6\u06d9\u06e7\u06d8\u06d8\u06eb\u06e0\u06e0\u06e7\u06dc\u06ec\u06eb\u06ec\u06da\u06da\u06e1\u06e2\u06d8\u06da\u06d7\u06df\u06e1"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    const-string v0, "\u06d6\u06d6\u06e5\u06d8\u06dc\u06db\u06d8\u06e7\u06ec\u06ec\u06ec\u06e8\u06d8\u06d7\u06d9\u06e8\u06d8\u06eb\u06e6\u06d6\u06d8\u06ec\u06e0\u06e2\u06eb\u06db\u06d6\u06d6\u06e4\u06dc\u06d8\u06e1\u06e1\u06d6\u06d9\u06da\u06e2\u06dc\u06e8\u06e5\u06d8\u06e2\u06da\u06d8\u06e0\u06d8\u06d8\u06e5\u06e2\u06e4"

    goto :goto_1

    :sswitch_3
    const-string v0, "\u06e5\u06e1\u06e1\u06d8\u06e2\u06dc\u06d8\u06d8\u06e1\u06df\u06d7\u06e7\u06d8\u06eb\u06df\u06e0\u06e6\u06e5\u06dc\u06d6\u06e4\u06dc\u06d6\u06d8\u06d6\u06e2\u06eb\u06eb\u06d9\u06d6\u06d8\u06eb\u06d9\u06d8\u06d8\u06ec\u06e4\u06e5\u06d8\u06e1\u06dc\u06e0\u06e0\u06e5\u06e2\u06dc\u06da\u06db\u06e5\u06da\u06e0"

    goto :goto_1

    :sswitch_4
    const v4, -0x5c05af6d

    const-string v0, "\u06df\u06e8\u06ec\u06e8\u06e5\u06d8\u06db\u06db\u06d7\u06ec\u06e8\u06d6\u06d8\u06d8\u06eb\u06e1\u06d8\u06db\u06d7\u06e0\u06e7\u06d8\u06e6\u06d8\u06ec\u06e5\u06e4\u06e1\u06d8\u06e4\u06e2\u06d6\u06e1\u06dc\u06df\u06dc\u06d8\u06e2\u06e4\u06e1\u06d8\u06ec\u06e7\u06e0\u06e1\u06d6\u06e1\u06d8\u06d9\u06da\u06e8\u06e7\u06e4\u06eb\u06da\u06e4\u06d7\u06d7\u06dc\u06d8"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const-string v0, "\u06e7\u06df\u06e0\u06da\u06dc\u06db\u06e0\u06d6\u06e6\u06da\u06e6\u06d8\u06ec\u06e8\u06e7\u06d8\u06e1\u06e6\u06d8\u06e2\u06e4\u06e1\u06d8\u06e8\u06db\u06e8\u06d8\u06e7\u06ec\u06e8\u06d8\u06df\u06e2\u06d9\u06e1\u06ec\u06e8\u06da\u06e4\u06d6\u06dc\u06e8\u06d8\u06df\u06e6\u06e5\u06e5\u06ec\u06eb\u06d8\u06ec\u06d7\u06e6\u06da\u06dc\u06d8\u06d8\u06d7\u06e8\u06d8\u06da\u06e5\u06e6\u06dc\u06e6\u06d8\u06e6\u06da\u06dc\u06d8"

    goto :goto_1

    :sswitch_6
    const-string v0, "\u06d9\u06e4\u06eb\u06d7\u06e6\u06e6\u06e5\u06dc\u06e8\u06e4\u06dc\u06df\u06e6\u06eb\u06dc\u06d6\u06d8\u06d8\u06d8\u06eb\u06e0\u06e8\u06db\u06e5\u06e5\u06d8\u06df\u06e7\u06e8\u06d9\u06e1\u06d8\u06da\u06db\u06e6\u06d8\u06d7\u06df\u06e6\u06d8\u06e2\u06ec\u06df\u06e5\u06df\u06eb\u06db\u06eb\u06db\u06ec\u06da\u06e5\u06d8\u06da\u06ec\u06db\u06e4\u06eb\u06ec\u06d6\u06d7\u06d6\u06e1\u06db\u06e2\u06d7\u06e4\u06e7\u06da\u06e5\u06d8\u06db\u06d7\u06e8\u06d8\u06e2\u06e2\u06e7\u06e7\u06d6\u06d8\u06e0\u06d6\u06e5\u06d7\u06dc\u06e8\u06d8"

    goto :goto_2

    :sswitch_7
    const v5, 0x747bcb61

    const-string v0, "\u06d9\u06e6\u06d9\u06d7\u06e5\u06da\u06db\u06d9\u06e4\u06e7\u06e7\u06da\u06d8\u06d6\u06e6\u06e2\u06e5\u06d6\u06e8\u06df\u06e7\u06e6\u06e5\u06d8\u06df\u06db\u06e1\u06d8\u06db\u06d7\u06d6\u06d8\u06e2\u06d9\u06e6\u06d8\u06eb\u06e4\u06e0\u06d9\u06e4\u06d6\u06d8\u06e8\u06e7\u06d6\u06d6\u06e7\u06d8"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    const-string v0, "\u06da\u06ec\u06e5\u06d8\u06d9\u06e2\u06db\u06d6\u06e7\u06eb\u06da\u06df\u06d6\u06dc\u06db\u06dc\u06d8\u06df\u06ec\u06ec\u06e4\u06e0\u06da\u06da\u06db\u06df\u06da\u06e6\u06df\u06e0\u06d8\u06d6\u06d8\u06e4\u06d6\u06d8\u06d8\u06dc\u06eb\u06d6\u06d8\u06d9\u06eb\u06d9\u06d7\u06e1\u06dc\u06d8\u06d8\u06e2\u06e0\u06e1\u06e6\u06e8\u06d6\u06e0\u06e4\u06eb\u06d9\u06dc\u06d7\u06e6\u06e7\u06d8\u06dc\u06da\u06dc\u06d8\u06e7\u06da\u06da\u06e4\u06e0\u06d9\u06d7\u06ec\u06e8\u06d8\u06d7\u06e2\u06e4\u06e1\u06dc\u06dc\u06da\u06e2\u06e6\u06d8\u06eb\u06ec\u06e0"

    goto :goto_3

    :cond_0
    const-string v0, "\u06db\u06d9\u06dc\u06da\u06e7\u06ec\u06ec\u06e4\u06e2\u06db\u06e1\u06e0\u06e0\u06dc\u06dc\u06d9\u06eb\u06d8\u06e2\u06dc\u06e7\u06e5\u06dc\u06d7\u06e2\u06db\u06e7\u06df\u06e7\u06ec\u06d6\u06ec\u06d8\u06d8\u06d7\u06dc\u06d9\u06e4\u06d8\u06e7\u06e8\u06e2\u06eb\u06d7\u06df\u06e8\u06d8\u06e1\u06e1\u06e7\u06e1\u06e6\u06e2\u06d8\u06e8\u06d8\u06d6\u06d8\u06dc\u06ec\u06da\u06e2\u06e4\u06e2\u06e4\u06e6\u06e0\u06d8\u06e6\u06d6\u06e6\u06e0\u06e1\u06d8\u06e7\u06ec\u06e8\u06e0\u06d7\u06db\u06e2\u06eb\u06db"

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_0

    const-string v0, "\u06e1\u06dc\u06da\u06eb\u06d9\u06df\u06e2\u06da\u06dc\u06d8\u06e4\u06e0\u06d7\u06d6\u06e0\u06e7\u06d9\u06da\u06d9\u06ec\u06df\u06dc\u06e7\u06d8\u06d9\u06da\u06da\u06ec\u06e7\u06e1\u06d8\u06d7\u06eb\u06e5\u06d8\u06dc\u06eb\u06e2\u06eb\u06d7\u06da\u06e6\u06e6\u06da\u06d6\u06e6\u06d6\u06ec\u06da\u06e4\u06ec\u06e7\u06ec\u06e7\u06e7\u06dc\u06d8\u06e1\u06da\u06d7\u06e4\u06eb\u06e2\u06df\u06ec\u06e1\u06d8\u06d8\u06ec\u06d7\u06d9\u06e0\u06e6\u06e6\u06e1\u06da\u06d8\u06d8\u06df\u06e8\u06da\u06eb\u06ec\u06e8\u06d8"

    goto :goto_3

    :sswitch_a
    const-string v0, "\u06d8\u06db\u06e6\u06df\u06db\u06d9\u06d6\u06e8\u06e0\u06d7\u06e1\u06e7\u06e5\u06e4\u06df\u06e5\u06e5\u06d8\u06db\u06e6\u06e0\u06d7\u06e4\u06d7\u06d6\u06e1\u06e1\u06d8\u06e6\u06e1\u06d9\u06e4\u06e1\u06e1\u06d8\u06e0\u06e0\u06eb\u06d8\u06d9\u06eb\u06e0\u06d8\u06d8\u06e2\u06db\u06d9\u06e0\u06e7\u06d8\u06e5\u06e6\u06d8\u06da\u06d6\u06e5\u06d7\u06e4\u06e5\u06d8\u06ec\u06db\u06d7\u06e0\u06e0\u06e6\u06e0\u06df\u06df\u06d6\u06e5\u06dc\u06dc\u06e1\u06e2"

    goto :goto_2

    :sswitch_b
    const-string v0, "\u06e6\u06e0\u06d6\u06e7\u06e5\u06d6\u06d8\u06e0\u06df\u06e1\u06d8\u06e4\u06db\u06d6\u06e4\u06e8\u06dc\u06d8\u06e4\u06d9\u06e1\u06e2\u06ec\u06dc\u06d8\u06e7\u06e8\u06e6\u06d8\u06db\u06d7\u06da\u06e0\u06dc\u06e8\u06d8\u06e0\u06df\u06db\u06dc\u06d6\u06d7\u06e7\u06eb\u06e8\u06d8\u06e7\u06eb\u06dc\u06d8\u06d8\u06e2\u06d8\u06d8\u06db\u06db\u06e6\u06e1\u06d9\u06eb\u06ec\u06d6\u06e6\u06d8\u06d7\u06dc\u06e5\u06d8\u06d8\u06e1\u06e5\u06d8\u06ec\u06d9\u06d9\u06e0\u06e0\u06d8\u06d8\u06e6\u06e7\u06e5\u06d8\u06e2\u06e5\u06e7"

    goto :goto_2

    :sswitch_c
    const-string v0, "\u06da\u06d8\u06d6\u06ec\u06db\u06d6\u06d8\u06ec\u06df\u06da\u06df\u06db\u06d9\u06e8\u06df\u06db\u06d6\u06e6\u06d8\u06ec\u06d9\u06e5\u06d8\u06d8\u06e4\u06e5\u06d8\u06e6\u06e7\u06e1\u06e1\u06e2\u06d6\u06dc\u06d8\u06eb\u06e1\u06e6\u06e6\u06dc\u06e5\u06d8\u06d7\u06d8\u06d6\u06d7\u06e1\u06d6\u06d8\u06d7\u06d7\u06e1\u06d8\u06d6\u06ec\u06e6\u06d8\u06df\u06d9\u06e4"

    goto :goto_0

    :sswitch_d
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v3, 0x6

    new-array v3, v3, [B

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const-string v0, "\u06e2\u06e6\u06e1\u06e2\u06e8\u06e2\u06db\u06e4\u06d7\u06e2\u06ec\u06ec\u06e4\u06e8\u06e4\u06e0\u06e0\u06da\u06d8\u06e8\u06e7\u06eb\u06eb\u06d8\u06d8\u06ec\u06dc\u06e5\u06db\u06df\u06e8\u06d8\u06e1\u06e0\u06d8\u06eb\u06e7\u06da\u06e2\u06e8\u06d8\u06e4\u06d9\u06d6\u06d8\u06e5\u06d9\u06e1\u06e0\u06e0\u06da\u06df\u06e6\u06e1\u06da\u06e6\u06da\u06e4\u06d6\u06e5\u06d8\u06e5\u06d7\u06e8\u06db\u06e7\u06e2"

    goto/16 :goto_0

    :sswitch_e
    throw v2

    :sswitch_f
    const-string v0, "\u06e1\u06dc\u06e6\u06d8\u06e8\u06e0\u06e5\u06d8\u06e4\u06ec\u06e8\u06d8\u06e5\u06ec\u06da\u06df\u06dc\u06e1\u06d6\u06da\u06e6\u06d8\u06e5\u06e7\u06e8\u06d8\u06d6\u06d6\u06dc\u06e2\u06da\u06d8\u06e4\u06d6\u06db\u06d6\u06e0\u06e8\u06d7\u06dc\u06e2\u06eb\u06e7\u06e8\u06d8\u06e2\u06e0\u06e8\u06d8\u06d6\u06e1\u06e4\u06e5\u06d7\u06d9\u06df\u06db\u06e1\u06e8\u06d8\u06d7"

    goto/16 :goto_0

    :sswitch_10
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x72f51794 -> :sswitch_d
        -0x30fa999e -> :sswitch_e
        -0xf336e81 -> :sswitch_1
        -0x32d0007 -> :sswitch_10
        0x76a0fc15 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x3b90af6a -> :sswitch_2
        -0x212f392f -> :sswitch_4
        -0x11d1df4c -> :sswitch_f
        0x61cf64c9 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x63b59878 -> :sswitch_7
        -0x3f63245 -> :sswitch_b
        0x2a136801 -> :sswitch_5
        0x4e5fb656 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x6ad623fd -> :sswitch_9
        -0x52d2303f -> :sswitch_6
        0x752ad27 -> :sswitch_8
        0x278412eb -> :sswitch_a
    .end sparse-switch

    :array_0
    .array-data 1
        -0xet
        0x19t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x7ct
        0x77t
        0x59t
        0x4t
        0xft
        -0x72t
    .end array-data
.end method

.method public static ۥۣ۟(L۟/g3;)V
    .locals 6

    const/4 v5, 0x6

    const-string v0, "\u06db\u06db\u06d6\u06e0\u06df\u06d7\u06d6\u06e5\u06d6\u06d8\u06df\u06d9\u06dc\u06d8\u06eb\u06d9\u06dc\u06d8\u06e6\u06e5\u06d9\u06da\u06dc\u06ec\u06e4\u06d6\u06e4\u06ec\u06e4\u06d7\u06e7\u06d9\u06e1\u06d8\u06da\u06e5\u06d6\u06d9\u06ec\u06e1\u06d8\u06d8\u06e2\u06d8\u06d8\u06dc\u06e8\u06e8\u06d8\u06da\u06d6\u06d8\u06d8\u06d8\u06d7\u06d7\u06d6\u06eb\u06e5\u06d8\u06d6\u06d8\u06e5\u06d8\u06d6\u06ec\u06dc\u06e4\u06e8\u06d6\u06e2\u06df\u06d8\u06e8\u06df\u06e6\u06d8\u06e2\u06da\u06d7\u06ec\u06e8\u06dc\u06d8\u06db\u06e1\u06d8\u06e8\u06e4\u06e6\u06e8\u06e0\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x194

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ca

    const/16 v2, 0x138

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x25b

    const/16 v2, 0x25b

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xdf

    const/16 v2, 0x1d5

    const v3, -0x2bbea6af

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06df\u06e1\u06e0\u06db\u06db\u06dc\u06d8\u06e5\u06da\u06e8\u06d8\u06da\u06e6\u06d7\u06db\u06e6\u06e6\u06db\u06e0\u06d6\u06d8\u06dc\u06e4\u06dc\u06d8\u06e6\u06d8\u06e8\u06d8\u06e1\u06e4\u06e5\u06ec\u06e5\u06e6\u06d8\u06ec\u06d9\u06d6\u06d8\u06df\u06e2\u06df\u06e7\u06e1\u06e6\u06d8\u06df\u06db\u06d6\u06d8\u06d9\u06d8\u06e1\u06eb\u06d7\u06e8\u06d6\u06e7\u06e1\u06e7\u06e1\u06dc\u06dc\u06e6\u06e8\u06e7\u06dc\u06df\u06df\u06d9\u06d6\u06d8"

    goto :goto_0

    :sswitch_1
    new-array v0, v5, [B

    fill-array-data v0, :array_0

    new-array v1, v5, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06da\u06e8\u06e7\u06d9\u06e7\u06e7\u06d9\u06e4\u06d8\u06d8\u06d9\u06e4\u06ec\u06d9\u06d7\u06e1\u06d8\u06e5\u06d9\u06d8\u06d8\u06d8\u06dc\u06d9\u06e8\u06e6\u06da\u06d9\u06dc\u06e0\u06e8\u06df\u06d9\u06d8\u06df\u06ec\u06d9\u06e2\u06e7\u06df\u06d7\u06d6\u06eb\u06e5\u06e6\u06d8\u06e1\u06d9\u06e8\u06db\u06ec\u06e0\u06eb\u06d8\u06d8\u06df\u06e7\u06e8\u06d8\u06e4\u06e1\u06e6\u06d8\u06e5\u06da\u06e1\u06d8\u06e8\u06e5\u06dc\u06e4\u06d6\u06d8\u06d8\u06d8\u06e0\u06e5"

    goto :goto_0

    :sswitch_2
    const v1, -0x6f199188

    const-string v0, "\u06e4\u06df\u06e2\u06d6\u06e4\u06d6\u06dc\u06d6\u06d7\u06d7\u06e5\u06d8\u06d7\u06db\u06e8\u06d8\u06dc\u06e6\u06e7\u06d9\u06d9\u06e0\u06e8\u06df\u06e0\u06ec\u06e7\u06da\u06e1\u06e2\u06e6\u06d9\u06e7\u06e5\u06e2\u06e6\u06d8\u06db\u06e6\u06e2\u06e7\u06e1\u06e0\u06e6"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v2, v1

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const-string v0, "\u06d9\u06ec\u06d6\u06d8\u06d9\u06d6\u06e7\u06e0\u06db\u06e0\u06e8\u06d9\u06e8\u06d8\u06dc\u06d7\u06d9\u06d9\u06d9\u06da\u06e0\u06db\u06e5\u06e2\u06e7\u06eb\u06e7\u06e6\u06d9\u06e2\u06e7\u06d9\u06ec\u06d7\u06d6\u06e2\u06e0\u06e8\u06e0\u06e1\u06eb\u06d8\u06dc\u06e8\u06e6\u06da\u06d6\u06e7\u06e6\u06e1\u06e0\u06d6\u06da\u06db\u06db\u06e1\u06d6\u06d7\u06df\u06df\u06df\u06e7\u06ec\u06e7\u06eb\u06df\u06e6\u06e4\u06e5\u06d8\u06d9\u06d8\u06e5"

    goto :goto_0

    :sswitch_4
    const-string v0, "\u06d6\u06dc\u06e1\u06d8\u06e2\u06eb\u06e5\u06d9\u06d8\u06e8\u06df\u06d7\u06e5\u06eb\u06eb\u06eb\u06e0\u06e1\u06df\u06e6\u06e1\u06df\u06e0\u06d8\u06ec\u06d7\u06e4\u06e8\u06e6\u06eb\u06e5\u06e6\u06e6\u06d8\u06d7\u06d6\u06d8\u06d6\u06d6\u06ec\u06df\u06e1\u06e5\u06d8\u06d7\u06d6\u06e7\u06df\u06e1\u06e4\u06e5\u06d7\u06e2\u06ec\u06d8\u06eb\u06d9\u06e0\u06e6\u06d8\u06e0\u06db\u06e6\u06d8\u06e1\u06e2\u06d6\u06e4\u06dc\u06da\u06e4\u06e0\u06e2\u06d9\u06e0\u06e5\u06e5\u06e4\u06df\u06e7\u06e1\u06d9\u06e1\u06d6"

    goto :goto_1

    :sswitch_5
    const v2, -0x34ea9d5a    # -9790118.0f

    const-string v0, "\u06d6\u06e1\u06e7\u06d8\u06d9\u06d6\u06e4\u06e5\u06e8\u06ec\u06eb\u06db\u06d7\u06eb\u06d6\u06ec\u06e5\u06e7\u06e2\u06e6\u06df\u06d6\u06dc\u06d8\u06eb\u06dc\u06e8\u06e6\u06d8\u06d6\u06d8\u06ec\u06e1\u06e8\u06da\u06d7\u06e6\u06e2\u06db\u06e4\u06e2\u06df\u06e1\u06d8\u06eb\u06e0\u06dc\u06dc\u06e0\u06d6\u06d8\u06e1\u06d9\u06df\u06d9\u06e0\u06e1\u06eb\u06e6\u06e8\u06ec\u06e5\u06e6\u06d8\u06e4\u06d6\u06e5\u06e5\u06d8\u06dc\u06e7\u06d6\u06d8\u06dc\u06ec\u06e6"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v3, v2

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v3, -0x6058d7d

    const-string v0, "\u06e5\u06e4\u06e6\u06d8\u06e2\u06e5\u06e8\u06dc\u06e1\u06e1\u06d8\u06ec\u06e4\u06e2\u06d7\u06da\u06da\u06db\u06da\u06d6\u06e7\u06da\u06ec\u06d7\u06d8\u06da\u06d6\u06e5\u06d8\u06d9\u06d8\u06e8\u06e7\u06ec\u06e8\u06e4\u06d6\u06e8\u06d8\u06d6\u06e6\u06d9\u06e5\u06d9\u06e5\u06e4\u06eb\u06dc\u06df\u06e8\u06e1\u06eb\u06e4\u06e7\u06e7\u06e7\u06e1\u06e0\u06e2\u06d6\u06d8\u06e7\u06df\u06eb\u06e2\u06e8\u06eb\u06e7\u06d7\u06d8\u06d8\u06e2\u06d8\u06e6\u06e4\u06e6\u06e1\u06e0\u06e4\u06e1\u06d8\u06e8\u06db\u06e8\u06d8"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    const-string v0, "\u06d7\u06d6\u06e6\u06e7\u06d9\u06d6\u06d8\u06e2\u06e2\u06e8\u06d8\u06db\u06e2\u06e6\u06d8\u06eb\u06e0\u06d6\u06da\u06e2\u06d8\u06da\u06df\u06e6\u06d6\u06e8\u06d8\u06e4\u06d6\u06e8\u06d8\u06e7\u06dc\u06e8\u06db\u06ec\u06e2\u06dc\u06d8\u06db\u06e4\u06e2\u06df\u06d9\u06ec\u06db\u06e8\u06dc\u06d8"

    goto :goto_2

    :cond_0
    const-string v0, "\u06e1\u06e1\u06d6\u06d9\u06e4\u06d6\u06d8\u06e6\u06ec\u06e8\u06d8\u06e7\u06eb\u06e1\u06d8\u06ec\u06e7\u06db\u06e8\u06d7\u06e6\u06d6\u06e1\u06e7\u06dc\u06dc\u06d8\u06d9\u06d6\u06df\u06e2\u06e8\u06e8\u06e5\u06da\u06e7\u06e2\u06db\u06d6\u06d8\u06da\u06e1\u06e7\u06d8\u06e8\u06db\u06e5\u06e4\u06e4\u06e4\u06da\u06e0\u06e2\u06e7\u06da\u06e2\u06dc\u06e0\u06e0\u06da\u06e2\u06d9\u06ec\u06e0\u06e0\u06d9\u06e7\u06e8\u06df\u06d6\u06d7\u06e0\u06e5\u06e7\u06e6\u06e7\u06d6\u06d8\u06d9\u06d8\u06e0\u06e6\u06d8\u06db\u06e1\u06e5\u06d8"

    goto :goto_3

    :sswitch_8
    invoke-static {}, L۟/l3;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u06e4\u06e8\u06e1\u06d8\u06d8\u06e7\u06e1\u06d9\u06d8\u06e2\u06d6\u06e7\u06db\u06e1\u06d8\u06e1\u06d8\u06e4\u06d8\u06ec\u06e2\u06e5\u06da\u06e5\u06e4\u06e4\u06ec\u06ec\u06eb\u06e4\u06d6\u06da\u06d6\u06e0\u06d7\u06df\u06e2\u06e8\u06d8\u06eb\u06e7\u06ec\u06da\u06e4\u06e1\u06d8\u06e7\u06dc\u06dc\u06d8\u06da\u06e2\u06e4\u06df\u06e4\u06e6\u06d8\u06eb\u06eb\u06dc\u06dc\u06eb\u06e6\u06d8\u06e2\u06da\u06e2\u06e6\u06e7\u06df\u06eb\u06e8\u06e0\u06e8\u06d6\u06d8\u06d8\u06e2\u06eb\u06eb"

    goto :goto_3

    :sswitch_9
    const-string v0, "\u06d7\u06e5\u06dc\u06d8\u06dc\u06d6\u06db\u06df\u06e7\u06d6\u06d8\u06e8\u06e5\u06e5\u06e7\u06e2\u06d9\u06e4\u06e1\u06eb\u06e5\u06dc\u06d6\u06e5\u06ec\u06d7\u06d6\u06dc\u06d8\u06e8\u06e1\u06e5\u06e8\u06e0\u06e7\u06e5\u06df\u06dc\u06d8\u06e6\u06e2\u06e4\u06eb\u06e8\u06eb\u06d7\u06e4\u06e1\u06d8\u06ec\u06df\u06dc\u06e7\u06d7\u06ec\u06db\u06e7\u06dc\u06da\u06da\u06d8\u06e0\u06e2\u06ec\u06da"

    goto :goto_3

    :sswitch_a
    const-string v0, "\u06e1\u06eb\u06d8\u06d8\u06dc\u06d6\u06e1\u06eb\u06e4\u06e8\u06d8\u06e7\u06df\u06e5\u06e2\u06e2\u06d8\u06e2\u06e6\u06e5\u06d7\u06d7\u06d7\u06df\u06eb\u06da\u06da\u06d6\u06d6\u06e8\u06d6\u06d8\u06d8\u06d8\u06e1\u06d7\u06df\u06ec\u06e5\u06e7\u06d6\u06df\u06e5\u06df\u06df\u06da\u06d8\u06ec\u06dc\u06e4\u06dc\u06d8\u06db\u06da\u06e1\u06d8\u06e0\u06e8\u06d6\u06d8\u06df\u06eb\u06d6\u06e0\u06eb\u06d7\u06ec\u06e5\u06d6\u06d8"

    goto :goto_2

    :sswitch_b
    const-string v0, "\u06d8\u06e0\u06d6\u06d6\u06e1\u06d6\u06d8\u06d9\u06df\u06e6\u06d9\u06d6\u06d8\u06dc\u06e1\u06e1\u06d8\u06e4\u06e2\u06e6\u06d8\u06ec\u06e7\u06d8\u06e2\u06dc\u06e7\u06d8\u06e8\u06e4\u06d6\u06e7\u06e6\u06e6\u06e0\u06da\u06e6\u06d8\u06eb\u06d9\u06e2\u06e2\u06e2\u06e5\u06d8\u06e0\u06da\u06e4\u06eb\u06e1\u06e0\u06d9\u06e2\u06e1\u06d9\u06e5\u06e8\u06d9\u06da\u06e5"

    goto :goto_2

    :sswitch_c
    const-string v0, "\u06e1\u06db\u06da\u06e1\u06e4\u06e8\u06d8\u06e4\u06eb\u06d8\u06d7\u06eb\u06ec\u06df\u06d9\u06e7\u06ec\u06e0\u06da\u06e8\u06d8\u06e0\u06e0\u06e6\u06d8\u06e2\u06e6\u06e8\u06d8\u06db\u06db\u06e7\u06d9\u06da\u06e8\u06d8\u06e1\u06df\u06e6\u06d9\u06dc\u06d8\u06e5\u06d8\u06d8\u06e5\u06ec\u06e4\u06d9\u06da\u06e2\u06e8\u06e2\u06d9\u06ec\u06d6\u06e7\u06d8\u06e1\u06d9\u06da\u06e1\u06d8\u06d9\u06d7\u06ec\u06dc\u06e0\u06d6\u06e8\u06e7\u06e1\u06d8\u06dc\u06e0\u06dc"

    goto :goto_1

    :sswitch_d
    const-string v0, "\u06d6\u06e6\u06eb\u06d8\u06e4\u06dc\u06d8\u06e8\u06e5\u06e8\u06d8\u06ec\u06df\u06e4\u06d9\u06e6\u06d9\u06dc\u06e1\u06eb\u06dc\u06dc\u06e1\u06d8\u06e8\u06e2\u06e6\u06d8\u06e6\u06d8\u06e2\u06e4\u06dc\u06e1\u06e1\u06e6\u06d7\u06d7\u06dc\u06d6\u06ec\u06e7\u06ec\u06e4\u06d8\u06e5\u06e6\u06dc\u06e1\u06d9\u06e7\u06d8\u06d8\u06df\u06d9\u06d8\u06d8\u06e6\u06e4\u06e6\u06d6\u06df\u06d8\u06d8\u06e4\u06e4\u06e2\u06eb\u06df\u06da\u06dc\u06d9\u06e0\u06e0\u06d6\u06d7\u06db\u06d9\u06d7"

    goto :goto_1

    :sswitch_e
    const-string v0, "\u06da\u06e8\u06e6\u06df\u06db\u06e8\u06d8\u06e1\u06df\u06d9\u06d7\u06d8\u06d7\u06dc\u06e2\u06eb\u06e0\u06e6\u06da\u06d8\u06db\u06e1\u06da\u06d7\u06d6\u06d7\u06e1\u06e4\u06e4\u06dc\u06e6\u06e8\u06d6\u06e6\u06da\u06dc\u06ec\u06e0\u06e2\u06e0\u06da\u06d9\u06e7\u06eb\u06e8\u06d8\u06ec\u06e2\u06e0\u06ec\u06d8\u06e6\u06d8\u06da\u06e0\u06dc\u06e8\u06db\u06e4\u06dc\u06e6\u06e7"

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, L۟/k3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, L۟/k3;-><init>(L۟/g3;I)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-string v0, "\u06d9\u06ec\u06d6\u06d8\u06d9\u06d6\u06e7\u06e0\u06db\u06e0\u06e8\u06d9\u06e8\u06d8\u06dc\u06d7\u06d9\u06d9\u06d9\u06da\u06e0\u06db\u06e5\u06e2\u06e7\u06eb\u06e7\u06e6\u06d9\u06e2\u06e7\u06d9\u06ec\u06d7\u06d6\u06e2\u06e0\u06e8\u06e0\u06e1\u06eb\u06d8\u06dc\u06e8\u06e6\u06da\u06d6\u06e7\u06e6\u06e1\u06e0\u06d6\u06da\u06db\u06db\u06e1\u06d6\u06d7\u06df\u06df\u06df\u06e7\u06ec\u06e7\u06eb\u06df\u06e6\u06e4\u06e5\u06d8\u06d9\u06d8\u06e5"

    goto/16 :goto_0

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x703d0d88 -> :sswitch_2
        -0x6c3dc23f -> :sswitch_f
        -0x90b2964 -> :sswitch_0
        0x27597c67 -> :sswitch_1
        0x700144f9 -> :sswitch_10
    .end sparse-switch

    :array_0
    .array-data 1
        0x3t
        0x0t
        -0x64t
        -0x4ft
        -0x6et
        0x56t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x62t
        0x63t
        -0x18t
        -0x28t
        -0x3t
        0x38t
    .end array-data

    nop

    :sswitch_data_1
    .sparse-switch
        -0x598bb2c5 -> :sswitch_e
        -0x476da336 -> :sswitch_d
        -0x13dfb858 -> :sswitch_5
        0x624d8445 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x3cf5c350 -> :sswitch_4
        -0xd3e1177 -> :sswitch_b
        0xa42a73e -> :sswitch_c
        0x1a9d1c4c -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x7caca7e5 -> :sswitch_a
        -0x75edf8be -> :sswitch_7
        -0x44f74735 -> :sswitch_9
        0xc7962bf -> :sswitch_8
    .end sparse-switch
.end method

.method public static ۥ۟ۤ(I)V
    .locals 4

    const-string v0, "\u06e4\u06d9\u06dc\u06d9\u06da\u06e0\u06da\u06da\u06d7\u06e1\u06d6\u06e1\u06d6\u06e5\u06d6\u06e4\u06e2\u06e5\u06db\u06d7\u06e7\u06e7\u06d7\u06e5\u06d8\u06ec\u06df\u06e1\u06e1\u06df\u06e6\u06d8\u06da\u06e5\u06e5\u06d8\u06e8\u06e8\u06e6\u06d7\u06db\u06e2\u06e4\u06ec\u06d7\u06e5\u06da\u06e7\u06e8\u06e8\u06e7\u06d9\u06e6\u06d7\u06d8\u06e5\u06d8\u06e4\u06e4\u06e1\u06da\u06db\u06e8\u06d8\u06e1\u06e2\u06e1\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x3a7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x147

    const/16 v2, 0x21a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x298

    const/16 v2, 0x1e6

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3b

    const/16 v2, 0xad

    const v3, 0x340e68de

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d6\u06d9\u06dc\u06e1\u06e1\u06ec\u06d8\u06e7\u06d8\u06d8\u06e2\u06e7\u06dc\u06e0\u06e6\u06e7\u06d8\u06e7\u06e0\u06e8\u06d8\u06e8\u06e0\u06dc\u06e8\u06ec\u06dc\u06e6\u06e0\u06da\u06eb\u06e7\u06e8\u06d7\u06e6\u06e2\u06e1\u06d9\u06e6\u06d8\u06d8\u06e1\u06e6\u06d8\u06eb\u06e2\u06e2\u06e1\u06ec\u06db\u06df\u06d8\u06d9\u06e6\u06e7\u06db\u06e6\u06e5\u06e1\u06d8\u06e8\u06e2\u06d9\u06d7\u06d7\u06e6\u06d8\u06db\u06e2\u06e0\u06e4\u06e1\u06e4\u06e8\u06e0\u06d8\u06d8\u06d8\u06ec\u06da"

    goto :goto_0

    :sswitch_1
    sput p0, L۟/l3;->ۥ۟ۡ:I

    const-string v0, "\u06d7\u06e1\u06d9\u06d8\u06ec\u06e5\u06e0\u06da\u06d8\u06dc\u06eb\u06e4\u06dc\u06e1\u06e8\u06d8\u06ec\u06e6\u06d7\u06e1\u06d7\u06d8\u06d8\u06d9\u06ec\u06e1\u06e5\u06da\u06e1\u06e7\u06d6\u06d6\u06da\u06e7\u06e1\u06d6\u06d9\u06e5\u06e5\u06da\u06e5\u06da\u06eb\u06e8\u06d8\u06e4\u06e7"

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1a324292 -> :sswitch_2
        0x64c40bf4 -> :sswitch_0
        0x69750a6b -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۥ۟ۥ(Landroid/content/Context;)V
    .locals 4

    const-string v0, "\u06e2\u06df\u06e1\u06e8\u06d8\u06dc\u06e8\u06da\u06e8\u06d8\u06db\u06eb\u06eb\u06e8\u06ec\u06e8\u06d8\u06e1\u06d7\u06e5\u06d8\u06e7\u06d9\u06d9\u06d9\u06e4\u06e6\u06d8\u06eb\u06e8\u06e1\u06d8\u06d8\u06d8\u06e5\u06db\u06e2\u06df\u06d6\u06dc\u06db\u06e1\u06eb\u06e8\u06e8\u06ec\u06e4\u06eb\u06dc\u06d8\u06e1\u06df\u06e7\u06ec\u06da\u06d6\u06df\u06eb\u06d6\u06d8\u06e5\u06ec\u06d8\u06d8\u06df\u06e6\u06e7\u06d8\u06d7\u06e0\u06d9\u06e2\u06db\u06e8\u06d8\u06ec\u06ec\u06d6\u06dc\u06e1\u06d8\u06e0\u06d8\u06e4\u06da\u06e5\u06e5\u06d8\u06e0\u06d9\u06e6\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0xf7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x13b

    const/16 v2, 0x2dc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2e2

    const/16 v2, 0x1c2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x11f

    const/16 v2, 0x1e3

    const v3, -0x39ce3bd0

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06e6\u06e7\u06df\u06d7\u06e5\u06d8\u06e8\u06d8\u06e4\u06ec\u06d8\u06d8\u06d7\u06d9\u06e2\u06dc\u06e0\u06d6\u06d8\u06eb\u06df\u06e6\u06d7\u06eb\u06e1\u06d8\u06e1\u06eb\u06e8\u06e4\u06da\u06e4\u06e2\u06e8\u06e6\u06e8\u06da\u06d8\u06d8\u06d8\u06d7\u06da\u06e4\u06e8\u06e0\u06e5\u06e1\u06df\u06d9\u06ec\u06d6\u06e6\u06eb\u06e5\u06d8\u06e5\u06e1\u06da"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e0\u06db\u06e4\u06e6\u06e2\u06e1\u06d8\u06e1\u06d9\u06d6\u06d9\u06eb\u06e5\u06d8\u06e5\u06d8\u06df\u06eb\u06e8\u06d6\u06e6\u06e4\u06dc\u06e4\u06da\u06e0\u06e6\u06dc\u06ec\u06e5\u06e6\u06e8\u06d8\u06df\u06e1\u06ec\u06d7\u06ec\u06eb\u06e6\u06da\u06d9\u06db\u06d6\u06d6\u06d8\u06dc\u06ec\u06dc"

    goto :goto_0

    :sswitch_2
    sput-object p0, L۟/l3;->ۥ:Landroid/content/Context;

    const-string v0, "\u06e5\u06e6\u06dc\u06d8\u06e2\u06d8\u06e2\u06e6\u06e6\u06d8\u06d9\u06e4\u06e7\u06e5\u06d7\u06db\u06e4\u06dc\u06e8\u06e8\u06e1\u06df\u06dc\u06dc\u06e1\u06d8\u06ec\u06d8\u06ec\u06eb\u06e0\u06e8\u06e1\u06e6\u06d7\u06da\u06e5\u06e4\u06d8\u06d8\u06d8\u06d8\u06e7\u06d6\u06d9\u06d6\u06da\u06d6\u06df\u06e5\u06d8\u06e7\u06dc\u06d8\u06e4\u06e8\u06da\u06e8\u06d6\u06e7\u06db\u06e6\u06df\u06d8\u06df"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6485765c -> :sswitch_0
        -0x43a34bf -> :sswitch_2
        0x6ffbf73e -> :sswitch_3
        0x76aa2726 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 1
        0x72t
        -0x6ft
        -0x63t
        0x70t
        -0x23t
        0x77t
        0x70t
    .end array-data

    :array_1
    .array-data 1
        0x4et
        -0x1et
        -0x8t
        0x4t
        -0x10t
        0x48t
    .end array-data
.end method

.method public static ۥ۟ۦ(Ljava/lang/String;)V
    .locals 4

    const-string v0, "\u06e2\u06d8\u06da\u06d8\u06e7\u06ec\u06df\u06e4\u06d6\u06d8\u06e7\u06e4\u06e1\u06d9\u06e1\u06db\u06db\u06ec\u06db\u06e5\u06e0\u06d6\u06dc\u06e1\u06d6\u06d8\u06e1\u06db\u06e6\u06e8\u06d8\u06d8\u06ec\u06e5\u06e1\u06d8\u06da\u06da\u06e8\u06d8\u06e4\u06eb\u06e1\u06d8\u06dc\u06e4\u06e0\u06db\u06e8\u06d8\u06d6\u06e7\u06d6\u06d8\u06e2\u06e1\u06e6\u06e4\u06e5\u06da\u06e7\u06d6\u06e8\u06d8\u06e4\u06e4\u06e5\u06d8\u06d8\u06ec\u06e6\u06d8\u06e7\u06e6\u06d7\u06ec\u06e6\u06d8\u06db\u06e6\u06e6\u06df\u06e5\u06e7\u06d9\u06e5\u06e8\u06e0\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1b1

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1c7

    const/16 v2, 0xcb

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x231

    const/16 v2, 0x257

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x361

    const/16 v2, 0x204

    const v3, -0x57442061

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d8\u06e1\u06d8\u06d8\u06e8\u06da\u06df\u06df\u06d7\u06e1\u06d8\u06e0\u06dc\u06e5\u06d8\u06ec\u06d8\u06e5\u06e6\u06db\u06e1\u06d8\u06d6\u06e1\u06d9\u06e0\u06d9\u06d9\u06d7\u06e5\u06d6\u06d8\u06ec\u06d8\u06d8\u06e6\u06ec\u06e6\u06d8\u06d6\u06d6\u06e1\u06e1\u06e0\u06e5\u06d8\u06d6\u06df\u06e6\u06d8\u06e1\u06d7\u06e6\u06d8\u06d6\u06e6\u06d8\u06d8\u06d6\u06ec\u06dc\u06d7\u06d6"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06dc\u06d9\u06e7\u06e0\u06e2\u06e8\u06e6\u06e8\u06e8\u06db\u06df\u06eb\u06e2\u06e6\u06e5\u06d8\u06d6\u06d7\u06d8\u06e1\u06e7\u06d8\u06dc\u06d9\u06d8\u06d8\u06e1\u06e8\u06d6\u06d8\u06db\u06ec\u06d7\u06d6\u06e8\u06e0\u06d8\u06d8\u06e1\u06d6\u06e7\u06dc\u06e1\u06e5\u06df\u06eb\u06df\u06e8\u06d8\u06d7\u06d9\u06e7\u06d7\u06e8\u06e2\u06e2\u06e5\u06d8\u06d8\u06e8\u06d8\u06d8\u06e2\u06db\u06e7\u06d9\u06e2\u06e1\u06d8\u06e7\u06d6\u06e5\u06eb\u06e8\u06d8\u06d8\u06df\u06d8"

    goto :goto_0

    :sswitch_2
    sput-object p0, L۟/l3;->ۥ۟۟:Ljava/lang/String;

    const-string v0, "\u06e6\u06e6\u06d6\u06d8\u06e5\u06d6\u06eb\u06df\u06ec\u06e8\u06d8\u06ec\u06e4\u06e7\u06e6\u06e6\u06e6\u06d8\u06d9\u06da\u06e2\u06db\u06da\u06dc\u06d8\u06e1\u06d7\u06e5\u06d8\u06e2\u06db\u06dc\u06e7\u06d8\u06e4\u06d9\u06e5\u06db\u06e6\u06dc\u06d8\u06e8\u06e1\u06d8\u06d6\u06df\u06d8\u06d8\u06e6\u06ec\u06e0\u06df\u06e1\u06ec\u06d6\u06e7\u06e5\u06d8\u06e5\u06da"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x28d924a1 -> :sswitch_1
        -0x250c7999 -> :sswitch_0
        0x207c3474 -> :sswitch_3
        0x3ddf887e -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        -0x5t
        -0x5at
        0x6ct
        -0x7dt
        -0x1t
        -0x1t
        -0x7t
    .end array-data

    :array_1
    .array-data 1
        -0x39t
        -0x2bt
        0x9t
        -0x9t
        -0x2et
        -0x40t
    .end array-data
.end method
