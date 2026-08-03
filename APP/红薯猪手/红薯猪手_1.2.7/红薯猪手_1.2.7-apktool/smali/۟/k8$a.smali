.class public final L۟/k8$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/k8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ()Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
    .locals 9

    const/4 v8, 0x7

    const/4 v7, 0x6

    sget-object v2, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۧ:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$c;

    sget-object v3, L۟/l3;->ۥ:Landroid/content/Context;

    const v1, -0x67031939

    const-string v0, "\u06df\u06d7\u06e8\u06e6\u06d6\u06e7\u06db\u06e8\u06e2\u06d6\u06e6\u06db\u06d6\u06e5\u06da\u06d6\u06da\u06eb\u06d6\u06d8\u06da\u06e4\u06dc\u06d8\u06d9\u06da\u06e8\u06d8\u06e8\u06e7\u06da\u06e8\u06e2\u06e8\u06d8\u06e2\u06e4\u06e4\u06e6\u06d9\u06d9\u06ec\u06e0\u06dc\u06e6\u06d9\u06e8\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v1

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06da\u06eb\u06d9\u06d9\u06d6\u06d8\u06eb\u06d7\u06e5\u06ec\u06df\u06df\u06e7\u06db\u06dc\u06d8\u06db\u06e7\u06da\u06d7\u06e6\u06e2\u06dc\u06dc\u06e0\u06e1\u06d6\u06e1\u06d8\u06e5\u06d8\u06d8\u06e5\u06db\u06d8\u06d8\u06d6\u06dc\u06df\u06d9\u06eb\u06e0\u06eb\u06e6\u06e2\u06e5\u06df\u06e2\u06e4\u06e6\u06db\u06e0\u06d7\u06db\u06db\u06dc\u06d8\u06db\u06e5\u06db\u06df\u06e7\u06e5\u06e2\u06dc\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e4\u06eb\u06d6\u06df\u06db\u06e1\u06d8\u06e2\u06e5\u06e5\u06e8\u06ec\u06db\u06eb\u06e4\u06eb\u06db\u06e6\u06d7\u06df\u06db\u06e6\u06db\u06db\u06e8\u06e0\u06d7\u06dc\u06da\u06e5\u06d6\u06e2\u06dc\u06e5\u06e8\u06e7\u06d8\u06eb\u06e8\u06e5\u06eb\u06e1\u06df\u06eb\u06e0\u06e8\u06e2\u06e5\u06e8\u06e5\u06e7\u06e8\u06eb\u06d7\u06e6\u06d8"

    goto :goto_0

    :sswitch_2
    const v4, -0x3ea8bd1c

    const-string v0, "\u06eb\u06eb\u06d7\u06da\u06ec\u06e8\u06d8\u06ec\u06da\u06e0\u06e5\u06d9\u06d6\u06e4\u06d9\u06d9\u06eb\u06e0\u06eb\u06dc\u06e7\u06da\u06e7\u06e5\u06d7\u06d8\u06e6\u06e5\u06d8\u06d7\u06e0\u06d7\u06df\u06d7\u06d8\u06e0\u06dc\u06da\u06d6\u06e8\u06e7\u06e5\u06d8\u06ec\u06e6\u06e1\u06e5\u06d8\u06da\u06eb\u06e0\u06e7\u06e8\u06e6\u06e1\u06dc\u06e7\u06d8"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const-string v0, "\u06e1\u06ec\u06e1\u06eb\u06d6\u06ec\u06ec\u06e0\u06db\u06e1\u06e2\u06e6\u06d8\u06e0\u06e0\u06d9\u06e1\u06db\u06d6\u06d6\u06d9\u06d8\u06e4\u06e2\u06dc\u06e5\u06d8\u06df\u06e4\u06d8\u06e5\u06d8\u06d8\u06d8\u06e8\u06d8\u06e0\u06d7\u06db\u06d8\u06d9\u06d9\u06d8\u06d8\u06e0\u06e2\u06e7\u06eb\u06dc\u06e5\u06d8\u06eb\u06df\u06e4\u06e0\u06df\u06e7\u06db\u06e1\u06e4\u06e8\u06e1\u06da\u06e1\u06e6\u06d7\u06e1\u06e4\u06dc\u06d8\u06df\u06e1\u06e6\u06da\u06e8\u06e4\u06e0\u06e7\u06e4\u06e1\u06e1\u06d6\u06e6\u06e8"

    goto :goto_0

    :sswitch_4
    const-string v0, "\u06e6\u06ec\u06ec\u06e8\u06e0\u06e6\u06d8\u06ec\u06e8\u06d8\u06dc\u06e8\u06e8\u06d8\u06da\u06e6\u06da\u06d8\u06eb\u06e5\u06e6\u06e7\u06eb\u06d7\u06df\u06e5\u06e6\u06e4\u06d9\u06d7\u06e4\u06da\u06d7\u06e6\u06e8\u06d8\u06df\u06e0\u06d8\u06d8\u06eb\u06eb\u06d7\u06e2\u06df\u06df\u06e7\u06e1\u06d7\u06dc\u06d8\u06e5\u06df\u06e4\u06da\u06df\u06e5\u06d9\u06d6\u06ec\u06d9\u06ec\u06da\u06df\u06e1\u06ec\u06e8\u06d8\u06dc\u06eb\u06d8\u06d8\u06e6\u06dc\u06d8\u06e7\u06e4\u06da"

    goto :goto_1

    :sswitch_5
    const v5, -0x58782ab5

    const-string v0, "\u06e2\u06e2\u06e8\u06d9\u06da\u06eb\u06d6\u06d8\u06df\u06e6\u06e7\u06d9\u06d8\u06e0\u06d6\u06d8\u06d7\u06db\u06d8\u06ec\u06da\u06d6\u06e6\u06e7\u06e4\u06e0\u06d6\u06dc\u06d7\u06df\u06df\u06d6\u06e5\u06eb\u06dc\u06df\u06e7\u06e6\u06e4\u06e5\u06e4\u06e4\u06eb\u06da\u06e6\u06df\u06e4\u06e8\u06d8\u06eb\u06dc\u06d8\u06e6\u06ec\u06e2\u06e4\u06d8\u06e1\u06d8\u06e1\u06da\u06e1\u06dc\u06e7\u06d8\u06d7\u06e7\u06dc\u06e8\u06df\u06e4\u06d8\u06e5\u06dc\u06d8\u06d6\u06e7\u06e5\u06d8\u06e6\u06da\u06d7\u06d6\u06e6"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const-string v0, "\u06e6\u06e0\u06e5\u06db\u06e2\u06dc\u06d8\u06d6\u06e4\u06e1\u06d8\u06df\u06e4\u06e6\u06d8\u06d6\u06e2\u06d8\u06d8\u06df\u06e7\u06e7\u06e0\u06e7\u06ec\u06ec\u06eb\u06d8\u06e5\u06e2\u06da\u06e0\u06e4\u06e4\u06e2\u06e0\u06e8\u06d9\u06d9\u06e1\u06e0\u06df\u06e5\u06e7\u06eb\u06e7\u06dc\u06d8\u06e4\u06e1\u06e6\u06e2\u06e6\u06e5\u06d8\u06e2\u06ec\u06e8\u06d8\u06da\u06d9\u06eb\u06e1\u06e2\u06dc\u06d8\u06e5\u06dc\u06df\u06d9\u06e4\u06eb\u06e7\u06e4\u06dc\u06d7\u06e1\u06d8\u06d7\u06e2\u06e1\u06e8\u06d8\u06e7\u06e8\u06d7\u06e8"

    goto :goto_1

    :cond_0
    const-string v0, "\u06da\u06eb\u06ec\u06e5\u06d7\u06e4\u06e2\u06df\u06da\u06e6\u06dc\u06e1\u06d9\u06eb\u06dc\u06eb\u06e5\u06d8\u06d8\u06d9\u06db\u06e6\u06eb\u06db\u06e8\u06df\u06e8\u06e2\u06ec\u06d8\u06e8\u06d8\u06db\u06e7\u06e8\u06d8\u06d6\u06e0\u06d8\u06d8\u06e4\u06d8\u06e8\u06e7\u06e5\u06e1\u06d8\u06d8\u06eb\u06e1\u06ec\u06e2\u06e4\u06eb\u06e6\u06e7\u06e8\u06e6\u06e1"

    goto :goto_2

    :sswitch_7
    if-eqz v3, :cond_0

    const-string v0, "\u06d6\u06dc\u06e8\u06db\u06e7\u06e6\u06d8\u06e5\u06e8\u06dc\u06da\u06eb\u06d8\u06d8\u06e7\u06d7\u06e7\u06d9\u06df\u06d8\u06d8\u06da\u06e6\u06d8\u06d8\u06db\u06e8\u06eb\u06eb\u06d9\u06d6\u06d7\u06e8\u06e0\u06e2\u06e0\u06e1\u06d8\u06e7\u06d6\u06ec\u06e7\u06e1\u06ec\u06e8\u06e5\u06e6\u06db\u06e6\u06ec\u06d9\u06e4\u06d8\u06d6\u06e4\u06d6\u06e8\u06e2\u06e5\u06d8"

    goto :goto_2

    :sswitch_8
    const-string v0, "\u06e7\u06e4\u06dc\u06d8\u06eb\u06d9\u06da\u06e4\u06e7\u06d8\u06e8\u06e4\u06eb\u06d8\u06e6\u06e2\u06d7\u06d7\u06e7\u06e4\u06d8\u06d7\u06da\u06ec\u06e1\u06d8\u06d8\u06d9\u06e2\u06e2\u06df\u06df\u06e0\u06e4\u06e1\u06d8\u06e1\u06e2\u06e8\u06d8\u06df\u06d8\u06d6\u06d8\u06d7\u06e4\u06dc\u06d7\u06d7\u06e7\u06e0\u06db\u06e7\u06da\u06dc\u06dc\u06d8\u06d7\u06d6\u06dc\u06d8"

    goto :goto_2

    :sswitch_9
    const-string v0, "\u06d9\u06ec\u06e4\u06d8\u06e5\u06e0\u06eb\u06dc\u06e0\u06da\u06e0\u06e1\u06e0\u06dc\u06dc\u06db\u06d9\u06eb\u06db\u06e8\u06d9\u06e8\u06d8\u06e2\u06d7\u06e4\u06e1\u06e8\u06e2\u06e6\u06e5\u06e0\u06d7\u06df\u06d8\u06e4\u06ec\u06da\u06d7\u06d8\u06e6\u06eb\u06e4\u06e7\u06e5\u06e2\u06d9\u06da\u06e7\u06e6\u06e6\u06ec\u06e4"

    goto :goto_1

    :sswitch_a
    new-array v0, v8, [B

    fill-array-data v0, :array_0

    new-array v1, v7, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    sget-object v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۨ:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    const v4, 0x51a5773b

    const-string v0, "\u06d9\u06e5\u06d8\u06d8\u06e1\u06e1\u06e5\u06d8\u06e8\u06d7\u06d7\u06e2\u06dc\u06e6\u06d8\u06da\u06db\u06e5\u06d8\u06eb\u06e5\u06e0\u06d8\u06db\u06df\u06d8\u06df\u06db\u06d6\u06e5\u06e6\u06d8\u06e8\u06d6\u06dc\u06d8\u06d7\u06e7\u06e6\u06d9\u06e5\u06d8\u06e2\u06dc\u06d8\u06e8\u06db\u06e5\u06d8\u06eb\u06df\u06e8\u06df\u06e1\u06d8\u06e4\u06e6\u06e1\u06d8\u06ec\u06df\u06df\u06e8\u06d7\u06e5\u06e2\u06e4\u06e6\u06d8\u06db\u06e2\u06df"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_3

    goto :goto_3

    :sswitch_b
    const-string v0, "\u06e2\u06e5\u06e2\u06e5\u06df\u06e5\u06df\u06e8\u06da\u06d9\u06eb\u06d9\u06df\u06e5\u06ec\u06df\u06e2\u06e8\u06dc\u06e7\u06d6\u06e6\u06e4\u06da\u06e2\u06da\u06e7\u06da\u06ec\u06da\u06d9\u06d9\u06db\u06e8\u06e1\u06d8\u06e4\u06ec\u06d6\u06d8\u06e6\u06da\u06d7\u06e4\u06eb\u06e6\u06d8\u06e6\u06d8\u06e7\u06d8\u06e7\u06e1\u06e1\u06d8\u06d7\u06d6\u06dc\u06d8"

    goto :goto_3

    :sswitch_c
    const-string v0, "\u06df\u06d9\u06da\u06e5\u06df\u06d7\u06e7\u06d9\u06e5\u06e6\u06df\u06d7\u06ec\u06db\u06e8\u06d8\u06dc\u06e5\u06e1\u06d9\u06e7\u06e8\u06df\u06dc\u06e4\u06e6\u06da\u06da\u06e2\u06dc\u06da\u06db\u06eb\u06df\u06e7\u06e6\u06e7\u06dc\u06e5\u06d8\u06d6\u06d6\u06d6\u06d8\u06e6\u06eb\u06dc\u06d7\u06df\u06e0\u06d9\u06e4\u06da\u06e7\u06e7\u06e0\u06e2\u06e8\u06ec\u06e0\u06e2\u06e7\u06e5\u06ec\u06dc\u06d8"

    goto :goto_3

    :sswitch_d
    const v5, 0x7fa7438d

    const-string v0, "\u06d9\u06e0\u06e8\u06d8\u06df\u06e1\u06d7\u06d7\u06df\u06e8\u06da\u06da\u06e7\u06e2\u06e1\u06e5\u06db\u06ec\u06e5\u06e5\u06d9\u06d6\u06d8\u06da\u06e7\u06e8\u06db\u06d7\u06e8\u06d8\u06e6\u06ec\u06df\u06dc\u06da\u06e1\u06d8\u06eb\u06e6\u06e8\u06da\u06d7\u06eb\u06e4\u06df\u06e8\u06d8\u06df\u06eb\u06e4\u06ec\u06dc\u06d8\u06e7\u06e6\u06d8\u06e7\u06e2\u06dc\u06e2\u06e0\u06e8\u06df\u06d9"

    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_4

    goto :goto_4

    :sswitch_e
    const-string v0, "\u06e0\u06df\u06e7\u06e8\u06e6\u06e8\u06d8\u06ec\u06e6\u06e8\u06d8\u06d9\u06d7\u06df\u06e7\u06df\u06d8\u06d8\u06e2\u06d9\u06e1\u06d8\u06d9\u06eb\u06e6\u06da\u06e8\u06ec\u06e2\u06e4\u06d6\u06d8\u06e5\u06d6\u06e7\u06d8\u06e5\u06eb\u06e5\u06d8\u06e8\u06dc\u06da\u06df\u06d8\u06d8\u06da\u06d8\u06da\u06d9\u06eb"

    goto :goto_4

    :sswitch_f
    const-string v0, "\u06e8\u06e5\u06e8\u06df\u06d9\u06dc\u06da\u06e5\u06e6\u06e4\u06d8\u06db\u06d7\u06e4\u06e5\u06d8\u06e2\u06e6\u06d8\u06db\u06e2\u06da\u06e8\u06e6\u06db\u06dc\u06eb\u06dc\u06d8\u06e7\u06e4\u06e2\u06da\u06df\u06d6\u06d6\u06e0\u06dc\u06d8\u06db\u06ec\u06e7\u06d9\u06e1\u06d6\u06d7\u06e0\u06d6\u06e1\u06e1\u06d7\u06d9\u06d9\u06e1\u06d7\u06e1\u06e6\u06d8\u06e2\u06db\u06e1\u06da\u06ec\u06e5\u06d8\u06da\u06eb\u06dc\u06d8\u06ec\u06da\u06e1\u06e2\u06da\u06e1\u06d8\u06df\u06e8\u06e8"

    goto :goto_4

    :sswitch_10
    const v6, -0x68546978

    const-string v0, "\u06df\u06d8\u06e5\u06e4\u06e5\u06da\u06e0\u06e4\u06eb\u06d7\u06da\u06d8\u06e7\u06e7\u06e1\u06d8\u06e6\u06d8\u06e0\u06dc\u06e4\u06e6\u06d9\u06e5\u06d6\u06e5\u06e7\u06e8\u06e5\u06eb\u06e6\u06d7\u06e2\u06e1\u06e6\u06e6\u06e0\u06df\u06df\u06eb\u06d9\u06e4\u06ec\u06e6\u06e5\u06d8\u06d7\u06e8\u06ec\u06e8\u06e8\u06d6\u06e7\u06e5\u06d6\u06db\u06d7\u06d7\u06e4\u06e8\u06dc\u06db\u06eb\u06db\u06d7\u06d6\u06da\u06eb\u06e4\u06dc\u06df\u06e1"

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v6

    sparse-switch v7, :sswitch_data_5

    goto :goto_5

    :sswitch_11
    const-string v0, "\u06e8\u06d6\u06e1\u06d8\u06da\u06e1\u06e8\u06dc\u06d8\u06e4\u06e1\u06d9\u06e8\u06e6\u06e4\u06e5\u06d8\u06d8\u06df\u06e5\u06d8\u06d6\u06d6\u06e6\u06d8\u06e8\u06d8\u06e0\u06df\u06dc\u06e8\u06da\u06e2\u06df\u06e0\u06e1\u06ec\u06d6\u06d9\u06df\u06dc\u06da\u06e1\u06e4\u06dc\u06d9\u06e4\u06df\u06e0\u06e7\u06db\u06dc\u06e4\u06e7\u06e2\u06ec\u06e4\u06d7"

    goto :goto_4

    :cond_1
    const-string v0, "\u06d6\u06dc\u06d8\u06e8\u06dc\u06e7\u06e8\u06da\u06e4\u06ec\u06dc\u06d9\u06d8\u06eb\u06eb\u06eb\u06e8\u06dc\u06e2\u06d9\u06e4\u06d7\u06e4\u06eb\u06ec\u06ec\u06e7\u06d7\u06e8\u06d9\u06e1\u06e0\u06dc\u06d8\u06db\u06e0\u06e0\u06da\u06d7\u06dc\u06d8\u06ec\u06db\u06ec\u06d7\u06df\u06df\u06d9\u06df\u06e8\u06d6\u06d9\u06d8\u06d8\u06ec\u06e8\u06e7\u06e5\u06e6\u06e1\u06da\u06ec\u06e5\u06d8\u06db\u06e5\u06df"

    goto :goto_5

    :sswitch_12
    if-nez v1, :cond_1

    const-string v0, "\u06e6\u06df\u06d6\u06e7\u06ec\u06df\u06ec\u06e1\u06eb\u06da\u06d8\u06d8\u06df\u06eb\u06df\u06e0\u06e5\u06da\u06e8\u06e5\u06df\u06e1\u06d8\u06da\u06ec\u06db\u06d6\u06e7\u06e7\u06e8\u06dc\u06d8\u06e1\u06ec\u06e6\u06d8\u06dc\u06ec\u06d9\u06dc\u06e5\u06eb\u06dc\u06dc\u06d8"

    goto :goto_5

    :sswitch_13
    const-string v0, "\u06e2\u06d9\u06e7\u06e6\u06dc\u06e2\u06e0\u06eb\u06dc\u06d8\u06e4\u06e0\u06e2\u06e8\u06e7\u06d8\u06d8\u06e5\u06ec\u06e7\u06e6\u06d7\u06e5\u06d6\u06d6\u06e8\u06d8\u06e2\u06e4\u06d8\u06e5\u06e5\u06e0\u06d8\u06e4\u06df\u06e5\u06e5\u06e1\u06df\u06e5\u06d8\u06d7\u06e8\u06d8\u06e2\u06e0\u06df\u06e0\u06db\u06d8\u06e8\u06db\u06db\u06e6\u06ec\u06e6\u06ec\u06df\u06e1\u06d8\u06d7\u06d6\u06dc\u06d8\u06d7\u06df\u06d9\u06d6\u06e7\u06e8\u06d8\u06ec\u06e0\u06e6\u06d8\u06db\u06e1\u06e7\u06d8\u06dc\u06e2\u06e1\u06d8\u06e1\u06da\u06e1"

    goto :goto_5

    :sswitch_14
    const-string v0, "\u06e5\u06e6\u06dc\u06d8\u06e0\u06d8\u06d9\u06df\u06d6\u06d8\u06d8\u06ec\u06e6\u06e5\u06eb\u06e5\u06dc\u06e6\u06e8\u06e2\u06e8\u06db\u06dc\u06d9\u06d9\u06e5\u06d7\u06e1\u06d8\u06db\u06e6\u06e6\u06d8\u06e0\u06e5\u06d6\u06da\u06e6\u06e8\u06d8\u06e8\u06e5\u06d8\u06d8\u06e7\u06d7\u06e4\u06e8\u06e5\u06e4\u06dc\u06d6\u06d8\u06d8\u06e4\u06eb\u06db\u06d9\u06ec\u06df\u06eb\u06e5\u06e4\u06e0\u06ec\u06eb\u06dc\u06d8\u06e5\u06d6\u06e4\u06e5\u06d8\u06d6\u06e7\u06d6\u06d8\u06e2\u06df\u06e7"

    goto :goto_3

    :sswitch_15
    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۨ:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    const v4, 0x64294285

    const-string v1, "\u06eb\u06d8\u06e2\u06d9\u06da\u06d6\u06df\u06eb\u06e8\u06df\u06db\u06e8\u06d6\u06e6\u06e0\u06eb\u06df\u06d9\u06ec\u06d8\u06e2\u06d8\u06d6\u06d8\u06d8\u06db\u06d6\u06dc\u06d7\u06e5\u06d6\u06d8\u06e0\u06df\u06dc\u06d8\u06d6\u06e5\u06d6\u06e4\u06d7\u06d8\u06d9\u06ec\u06e0\u06e2\u06db\u06e6\u06db\u06e0\u06e5\u06e5\u06d8\u06d7\u06dc\u06e4\u06e2\u06da\u06da\u06db\u06e0\u06e7\u06d9\u06d6\u06e7\u06d8\u06d9\u06e6\u06e4\u06d9\u06e8\u06d9\u06db\u06d6\u06e7\u06d8"

    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_6

    goto :goto_6

    :sswitch_16
    invoke-static {v3}, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase$c;->ۥ(Landroid/content/Context;)Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    move-result-object v0

    sput-object v0, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۨ:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_17
    monitor-exit v2

    :goto_7
    return-object v0

    :sswitch_18
    :try_start_1
    const-string v1, "\u06ec\u06e2\u06e1\u06d8\u06e2\u06d7\u06e2\u06e6\u06eb\u06da\u06db\u06e8\u06d8\u06da\u06d8\u06d9\u06e5\u06d8\u06e4\u06e7\u06dc\u06dc\u06e0\u06e2\u06dc\u06d8\u06db\u06d8\u06e2\u06d6\u06e6\u06d6\u06e5\u06d8\u06e1\u06d8\u06e5\u06eb\u06e6\u06d8\u06dc\u06e5\u06df\u06e5\u06db\u06e1\u06e5\u06e1\u06d8\u06d9\u06dc\u06e0\u06e0\u06eb\u06db\u06d9\u06df\u06d9\u06e4\u06e8\u06e4\u06e8\u06e1\u06eb\u06d6\u06d8\u06e2\u06e2\u06da\u06d8\u06df\u06d6\u06db\u06d6\u06db\u06df"

    goto :goto_6

    :sswitch_19
    const v5, 0x24b40be6

    const-string v1, "\u06e1\u06e6\u06e6\u06d8\u06e4\u06e0\u06dc\u06db\u06e1\u06d7\u06eb\u06e5\u06d8\u06eb\u06d8\u06e1\u06e7\u06db\u06e2\u06d8\u06d8\u06ec\u06d8\u06d6\u06d8\u06e6\u06e2\u06d8\u06d8\u06e2\u06d6\u06db\u06e8\u06d6\u06e0\u06e5\u06e7\u06df\u06db\u06d8\u06eb\u06e2\u06e1\u06df\u06e8\u06d7\u06e8\u06e5\u06e1\u06d9\u06d6\u06d8\u06e7\u06e1\u06df\u06dc\u06db\u06da\u06e7\u06e6\u06ec\u06df"

    :goto_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_7

    goto :goto_8

    :sswitch_1a
    const v6, -0x5e05a372

    const-string v1, "\u06e6\u06e7\u06e7\u06d6\u06ec\u06e1\u06d8\u06eb\u06df\u06e5\u06d7\u06e1\u06e7\u06e4\u06e4\u06da\u06dc\u06ec\u06eb\u06e8\u06e6\u06df\u06e1\u06eb\u06ec\u06e1\u06e5\u06d7\u06e7\u06db\u06db\u06db\u06e8\u06e8\u06d8\u06e2\u06e8\u06e8\u06d8\u06e1\u06e1\u06e1\u06d8\u06e1\u06e0\u06eb\u06dc\u06da\u06e6\u06d8\u06da\u06d7\u06e1\u06d8\u06e2\u06db\u06da\u06da\u06d7\u06e1\u06ec\u06d6\u06e7\u06d8\u06e7\u06e1\u06d7\u06df\u06d9\u06df\u06ec\u06e0\u06e4\u06da\u06e7\u06d9\u06dc\u06ec\u06e8\u06d8\u06e1\u06d8\u06d8\u06eb\u06e1\u06eb\u06e8\u06dc\u06e2"

    :goto_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v6

    sparse-switch v7, :sswitch_data_8

    goto :goto_9

    :sswitch_1b
    const-string v1, "\u06e0\u06d7\u06df\u06e6\u06e1\u06e1\u06d8\u06d8\u06d9\u06db\u06e6\u06da\u06d6\u06dc\u06e4\u06e0\u06e1\u06dc\u06d7\u06df\u06eb\u06df\u06e2\u06dc\u06e7\u06db\u06e4\u06e8\u06e8\u06d6\u06e1\u06d8\u06da\u06e1\u06eb\u06e0\u06e5\u06d6\u06d8\u06e5\u06e0\u06e1\u06d8\u06e4\u06db\u06eb\u06db\u06db\u06e5"

    goto :goto_8

    :cond_2
    const-string v1, "\u06e8\u06df\u06da\u06dc\u06e0\u06e6\u06e2\u06d6\u06e1\u06d8\u06e0\u06e8\u06e6\u06ec\u06e6\u06d8\u06e5\u06e0\u06e0\u06d8\u06e1\u06dc\u06da\u06e2\u06e8\u06dc\u06d8\u06da\u06d7\u06e8\u06d8\u06dc\u06d8\u06db\u06e1\u06e1\u06e1\u06e6\u06e6\u06e5\u06d8\u06d9\u06e8\u06e7\u06d8\u06df\u06e5\u06e6\u06e5\u06e0\u06ec\u06e2\u06d6\u06e6\u06e8\u06eb\u06dc\u06d8\u06d7\u06e2\u06e5\u06d8\u06d6\u06d6\u06df\u06db\u06dc\u06e6\u06e5\u06d7\u06e7\u06db\u06e8\u06e8\u06d8\u06ec\u06d6\u06e2"

    goto :goto_9

    :sswitch_1c
    if-nez v0, :cond_2

    const-string v1, "\u06e7\u06dc\u06e7\u06d8\u06e1\u06dc\u06d6\u06d8\u06e5\u06dc\u06ec\u06df\u06e6\u06e7\u06da\u06e2\u06e7\u06e2\u06eb\u06e2\u06e4\u06d8\u06d8\u06e6\u06e8\u06e0\u06ec\u06e4\u06eb\u06e1\u06d8\u06e7\u06e0\u06e6\u06e0\u06eb\u06e6\u06d8\u06e7\u06d6\u06db\u06da\u06e5\u06d6\u06d8\u06d9\u06da\u06d8\u06d8\u06d8\u06ec\u06e5\u06df\u06e4\u06d8\u06e5\u06e2\u06d7\u06dc\u06e6\u06d8\u06eb\u06d6\u06e6\u06e5\u06da\u06e7\u06e7\u06da\u06df\u06e8\u06df\u06db\u06e2\u06d7\u06e8"

    goto :goto_9

    :sswitch_1d
    const-string v1, "\u06df\u06d8\u06ec\u06d9\u06e8\u06e5\u06e0\u06d8\u06da\u06e5\u06dc\u06df\u06e0\u06eb\u06eb\u06d6\u06d6\u06da\u06e8\u06df\u06eb\u06e7\u06e7\u06e8\u06d8\u06db\u06e8\u06e5\u06d8\u06db\u06e8\u06e8\u06ec\u06d7\u06d6\u06da\u06dc\u06d6\u06da\u06d9\u06e8\u06d8\u06e6\u06e4\u06dc\u06e0\u06e4\u06dc\u06d8"

    goto :goto_9

    :sswitch_1e
    const-string v1, "\u06d7\u06e7\u06d8\u06e8\u06e8\u06e6\u06d8\u06d8\u06e5\u06df\u06e8\u06dc\u06dc\u06db\u06d6\u06eb\u06da\u06e2\u06e6\u06e8\u06d8\u06df\u06df\u06db\u06d6\u06d7\u06e5\u06e0\u06e8\u06d8\u06e2\u06d6\u06dc\u06d8\u06ec\u06d6\u06e6\u06d8\u06e2\u06df\u06e7\u06d6\u06e0\u06e5\u06e6\u06e6\u06df\u06e2\u06e5\u06d9\u06e2\u06e7\u06e0\u06ec\u06e0\u06d7\u06e7\u06e7\u06e8\u06e2\u06e6\u06d8\u06ec\u06e7\u06df\u06e5\u06dc\u06dc\u06d8\u06d7\u06e0\u06d8\u06eb\u06da"

    goto :goto_8

    :sswitch_1f
    const-string v1, "\u06e1\u06d9\u06e4\u06eb\u06d9\u06dc\u06d8\u06e5\u06db\u06ec\u06da\u06df\u06dc\u06d7\u06df\u06dc\u06d8\u06df\u06e7\u06dc\u06d8\u06e0\u06e4\u06d6\u06db\u06eb\u06eb\u06e0\u06d7\u06e1\u06d8\u06df\u06da\u06d6\u06d8\u06e8\u06db\u06e8\u06d6\u06e4\u06eb\u06ec\u06e2\u06dc\u06d9\u06eb\u06db\u06d9\u06db\u06e8\u06da\u06e2\u06e5\u06e8\u06e1\u06e5\u06d8\u06d8\u06e8\u06da\u06db\u06d6\u06da\u06d8\u06df\u06eb\u06e5\u06e0\u06d6\u06ec\u06e1\u06d8\u06d6\u06e2\u06df"

    goto :goto_8

    :sswitch_20
    const-string v1, "\u06e5\u06da\u06eb\u06db\u06df\u06db\u06e0\u06dc\u06e1\u06d8\u06d6\u06e6\u06d6\u06da\u06db\u06e2\u06dc\u06e0\u06e1\u06d7\u06e8\u06e4\u06d7\u06df\u06e7\u06d8\u06d8\u06e0\u06eb\u06e2\u06e4\u06e0\u06ec\u06d8\u06ec\u06df\u06e0\u06e2\u06e1\u06e1\u06e8\u06e6\u06d8\u06d8\u06eb\u06d9\u06e7\u06e1\u06d6\u06db\u06e8\u06e7\u06d8\u06e8\u06e1\u06e4\u06e6\u06d8\u06e5\u06d8\u06e1\u06e0\u06e6\u06e8\u06e4\u06e1\u06e1\u06d8\u06df\u06e5\u06d7\u06e7\u06eb\u06dc\u06d8\u06e8\u06d7\u06d7\u06df\u06e2\u06dc\u06d8\u06da\u06db\u06e1"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :sswitch_21
    const-string v1, "\u06dc\u06e0\u06dc\u06e5\u06d6\u06e6\u06db\u06e1\u06e5\u06e5\u06e8\u06ec\u06e1\u06e5\u06e6\u06d8\u06e7\u06db\u06e8\u06e5\u06dc\u06e6\u06e2\u06ec\u06dc\u06d8\u06e2\u06e0\u06e6\u06e0\u06e8\u06d8\u06d6\u06db\u06df\u06e1\u06dc\u06e2\u06db\u06db\u06db\u06d6\u06d8\u06e7\u06e0\u06d6\u06d8"

    goto :goto_6

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :sswitch_22
    new-array v0, v8, [B

    fill-array-data v0, :array_2

    new-array v1, v7, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :sswitch_23
    move-object v0, v1

    goto :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        -0x309eb2af -> :sswitch_0
        0xb38a6e9 -> :sswitch_22
        0x2f0a0f45 -> :sswitch_a
        0x696ac213 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x211387e2 -> :sswitch_5
        0x3f8979bd -> :sswitch_1
        0x49855446 -> :sswitch_3
        0x764c52d6 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x6ca1976d -> :sswitch_4
        -0x467f54ce -> :sswitch_6
        -0x33301ae5 -> :sswitch_8
        0x6077dc11 -> :sswitch_7
    .end sparse-switch

    :array_0
    .array-data 1
        0x6bt
        -0xdt
        0x3at
        -0x3et
        -0x1ct
        0x2ct
        0x7ct
    .end array-data

    :array_1
    .array-data 1
        0x8t
        -0x64t
        0x54t
        -0x4at
        -0x7ft
        0x54t
    .end array-data

    nop

    :sswitch_data_3
    .sparse-switch
        0x1d25cc29 -> :sswitch_15
        0x3d989a0b -> :sswitch_b
        0x41de890f -> :sswitch_23
        0x7edd6daa -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x2eb93300 -> :sswitch_e
        -0x11834d98 -> :sswitch_14
        0x168a6fbd -> :sswitch_10
        0x7ed341b9 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        -0x5e83eeb0 -> :sswitch_f
        -0x337296d7 -> :sswitch_13
        -0x231bf00 -> :sswitch_11
        0x4688959a -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        -0x3663b10f -> :sswitch_19
        -0x1829ba4 -> :sswitch_21
        0x28366d8 -> :sswitch_17
        0x7c865fc0 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        -0x566f50b2 -> :sswitch_1f
        -0x53390865 -> :sswitch_20
        0xd948d8c -> :sswitch_18
        0x1fcff9be -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        -0x425e93d6 -> :sswitch_1b
        -0x155b8457 -> :sswitch_1c
        0x498245a2 -> :sswitch_1e
        0x5f495fb8 -> :sswitch_1d
    .end sparse-switch

    :array_2
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    :array_3
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥ۟()L۟/k;
    .locals 4

    const-string v0, "\u06eb\u06e8\u06df\u06df\u06d7\u06eb\u06d8\u06e7\u06e0\u06e8\u06e5\u06d8\u06d8\u06e0\u06e7\u06e4\u06e7\u06e2\u06e4\u06d6\u06e7\u06d8\u06d8\u06d7\u06d9\u06d7\u06ec\u06e4\u06e1\u06d8\u06e6\u06e8\u06e6\u06d8\u06e6\u06ec\u06e6\u06d7\u06e6\u06d8\u06e8\u06d8\u06dc\u06da\u06db\u06d9\u06d9\u06e0\u06e5\u06e4\u06dc\u06e5\u06d9\u06e0\u06e1\u06e8\u06d9\u06e7\u06eb\u06ec\u06d8\u06d8\u06df\u06e1\u06d7\u06d7\u06e5\u06d7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x2eb

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x397

    const/16 v2, 0x10c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2e5

    const/16 v2, 0xd7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1d7

    const/16 v2, 0x1b8

    const v3, 0x56350b88

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2a2dbf96
        :pswitch_0
    .end packed-switch
.end method

.method public static ۥ۟۟(L۟/k;)V
    .locals 4

    const-string v0, "\u06e2\u06e0\u06d7\u06d8\u06d8\u06e0\u06e2\u06e8\u06d8\u06eb\u06d7\u06d6\u06df\u06ec\u06df\u06dc\u06ec\u06e6\u06e6\u06d9\u06e6\u06d8\u06eb\u06d7\u06e7\u06e8\u06db\u06e2\u06dc\u06ec\u06e7\u06d8\u06e1\u06d8\u06e2\u06d6\u06d6\u06d8\u06e1\u06d9\u06e6\u06ec\u06d9\u06d7\u06dc\u06e0\u06ec\u06e2\u06dc\u06d7\u06da\u06e7\u06e8\u06df\u06d9\u06e6\u06e7\u06d9\u06e7\u06e8\u06d8\u06d9\u06dc\u06df"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x199

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x20

    const/16 v2, 0x353

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x28c

    const/16 v2, 0x1d4

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2fc

    const/16 v2, 0x220

    const v3, -0x385dae69

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e8\u06d7\u06df\u06d6\u06db\u06db\u06df\u06db\u06ec\u06db\u06d9\u06e5\u06d8\u06d6\u06e5\u06d8\u06e2\u06e7\u06d9\u06e4\u06df\u06e5\u06d8\u06e0\u06da\u06e8\u06da\u06df\u06e1\u06d8\u06df\u06e1\u06e1\u06d8\u06db\u06d7\u06d8\u06d8\u06eb\u06e7\u06e4\u06d8\u06e7\u06df\u06eb\u06e7\u06eb\u06e8\u06d8\u06dc\u06e1\u06e6\u06d8\u06d8\u06e1\u06e5\u06d8\u06e7\u06e6\u06e8\u06d8\u06e6\u06dc\u06e1\u06d8\u06ec\u06e8\u06eb\u06e2\u06da\u06ec\u06df\u06e8\u06e4\u06db\u06e7\u06e1\u06d8\u06e0\u06db\u06d6\u06d8\u06e6\u06e7\u06e6\u06e0\u06e7\u06e5\u06e6\u06e2\u06e2"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06e7\u06d8\u06e6\u06e1\u06d7\u06e5\u06d7\u06d9\u06e1\u06ec\u06e2\u06d8\u06ec\u06e5\u06e8\u06d7\u06e4\u06e5\u06df\u06e1\u06e6\u06d8\u06da\u06e7\u06d8\u06d8\u06e2\u06e2\u06e1\u06e0\u06da\u06e8\u06e2\u06e7\u06db\u06ec\u06df\u06e5\u06e5\u06d8\u06d6\u06d8\u06eb\u06df\u06da\u06e1\u06d8"

    goto :goto_0

    :sswitch_2
    sput-object p0, L۟/k8;->ۥۣ۟:L۟/k;

    const-string v0, "\u06e5\u06d9\u06e5\u06da\u06e7\u06e1\u06e0\u06d9\u06db\u06da\u06e5\u06e1\u06e7\u06d7\u06e4\u06e1\u06e6\u06d8\u06db\u06eb\u06dc\u06d8\u06e5\u06db\u06e4\u06e4\u06d6\u06d8\u06e4\u06db\u06db\u06e8\u06ec\u06e2\u06df\u06e4\u06e8\u06d8\u06d7\u06e1\u06df\u06da\u06d6\u06e7\u06d8\u06da\u06e0\u06e5\u06d8\u06e2\u06d9\u06e1\u06d8\u06dc\u06da\u06e5\u06d8\u06e6\u06da\u06e6\u06e0\u06d8\u06e6\u06e2\u06eb\u06dc\u06d8\u06d6\u06e8\u06d7\u06e6\u06df\u06e6\u06da\u06d7\u06da\u06d8\u06ec\u06d6\u06d8\u06e6\u06d6\u06e6\u06d8\u06d8\u06df\u06d6\u06e4\u06eb\u06d8\u06d8"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x766f4f75 -> :sswitch_1
        -0x674c67fe -> :sswitch_3
        0x34546c9a -> :sswitch_0
        0x6a7b15a1 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        -0x35t
        -0x63t
        -0x29t
        -0x2at
        0x0t
        -0x19t
        -0x37t
    .end array-data

    :array_1
    .array-data 1
        -0x9t
        -0x12t
        -0x4et
        -0x5et
        0x2dt
        -0x28t
    .end array-data
.end method

.method public static ۥ۟۠(Ljava/lang/String;)V
    .locals 4

    const-string v0, "\u06d9\u06e0\u06e1\u06d8\u06e4\u06e0\u06da\u06e7\u06d9\u06d6\u06d7\u06d9\u06da\u06d8\u06e5\u06e5\u06d9\u06db\u06e2\u06e8\u06d8\u06d9\u06e7\u06e5\u06d8\u06e1\u06e5\u06e0\u06e7\u06e6\u06e6\u06d6\u06e2\u06df\u06d9\u06e8\u06db\u06dc\u06ec\u06e1\u06e6\u06e1\u06e7\u06e0\u06d7\u06d8\u06d8\u06ec\u06eb\u06e6\u06eb\u06e1\u06dc\u06d9\u06e1\u06e5\u06d8\u06dc\u06dc\u06db\u06db\u06e5\u06e5\u06d8\u06db\u06dc\u06e0"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x349

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x324

    const/16 v2, 0x3d3

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x25c

    const/16 v2, 0x352

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x125

    const/16 v2, 0x38

    const v3, -0x6fc287cf

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e8\u06e1\u06e6\u06e5\u06e8\u06e4\u06e7\u06db\u06df\u06da\u06e2\u06df\u06db\u06dc\u06ec\u06e4\u06e8\u06d8\u06d8\u06e2\u06e5\u06d6\u06db\u06d9\u06e8\u06d8\u06e4\u06dc\u06e5\u06ec\u06e8\u06e5\u06d8\u06eb\u06da\u06da\u06dc\u06e5\u06e6\u06d6\u06ec\u06d8\u06e7\u06e4\u06eb\u06db\u06e0\u06eb\u06d9\u06d8\u06ec\u06df\u06ec\u06da\u06e7\u06eb\u06dc\u06e0\u06e4\u06e4\u06e8\u06d6\u06d8\u06dc\u06ec\u06da\u06e5\u06e7\u06d8\u06e5\u06e5\u06ec\u06d6\u06db\u06ec\u06e4\u06e4\u06da\u06e5\u06e7\u06d8"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06db\u06e5\u06e0\u06db\u06d8\u06e1\u06d6\u06d6\u06e0\u06e2\u06d7\u06e0\u06e4\u06dc\u06dc\u06d8\u06e1\u06d6\u06e5\u06d8\u06eb\u06e2\u06d8\u06d8\u06d7\u06e4\u06eb\u06d6\u06d9\u06eb\u06db\u06e8\u06da\u06e4\u06e7\u06e0\u06db\u06da\u06e6\u06d8\u06e4\u06da\u06da\u06d6\u06e8\u06db\u06da\u06d9\u06d8\u06e2\u06d8\u06d6\u06e8\u06e2\u06e0\u06d7\u06e2\u06e1\u06d8\u06e6\u06e0\u06e8\u06e5\u06d8\u06d9\u06ec\u06e0\u06d7\u06d9\u06eb\u06d7\u06e6\u06e5\u06d8\u06e5\u06d9\u06e6\u06d8"

    goto :goto_0

    :sswitch_2
    sput-object p0, L۟/k8;->ۥ۟ۤ:Ljava/lang/String;

    const-string v0, "\u06e7\u06ec\u06d9\u06db\u06d6\u06e1\u06e6\u06d8\u06e8\u06e2\u06d6\u06e6\u06e7\u06e8\u06ec\u06da\u06d8\u06d8\u06e6\u06e1\u06e1\u06d8\u06e2\u06eb\u06da\u06d9\u06d8\u06ec\u06db\u06d7\u06e1\u06d8\u06e4\u06e7\u06d7\u06dc\u06db\u06e5\u06d8\u06e4\u06e8\u06e7\u06d8\u06df\u06e7\u06d8\u06e5\u06e2\u06e5\u06d8\u06dc\u06d6\u06ec\u06d6\u06dc\u06d7\u06e0\u06e7\u06e0"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72993215 -> :sswitch_3
        -0x4c26d205 -> :sswitch_1
        0x58883318 -> :sswitch_0
        0x5ba8825c -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x47t
        -0x17t
        -0x73t
        0x10t
        -0x27t
        -0x8t
        0x45t
    .end array-data

    :array_1
    .array-data 1
        0x7bt
        -0x66t
        -0x18t
        0x64t
        -0xct
        -0x39t
    .end array-data
.end method
