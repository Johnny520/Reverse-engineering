.class public final La/c5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/c5$a;
    }
.end annotation


# static fields
.field public static final f:[Ljava/lang/String;

.field public static volatile g:Z

.field public static volatile h:Ljava/lang/String;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/c5$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "va5"

    const-string v1, "kc5"

    const-string v2, "com.tencent.mm"

    const-string v3, "sd5"

    const-string v4, "yf5"

    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/c5;->f:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "apkPath"

    invoke-static {v2, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, La/c5;->a:Landroid/app/Activity;

    iput-object v2, v0, La/c5;->b:Ljava/lang/String;

    const-string v2, "dexkit_scan_cache"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "getSharedPreferences(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, La/c5;->c:Landroid/content/SharedPreferences;

    new-instance v4, La/c5$a;

    new-instance v1, La/b5;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, La/b5;-><init>(La/c5;I)V

    const-string v2, "conversation_mvvm_list_v3"

    const/16 v5, 0x19

    const-string v6, "\u4f1a\u8bddMVVM\u5217\u8868"

    invoke-direct {v4, v6, v2, v5, v1}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v5, La/c5$a;

    new-instance v1, La/b5;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La/b5;-><init>(La/c5;I)V

    const-string v2, "quick_add_menu_v10"

    const/16 v6, 0x14

    const-string v7, "\u5feb\u6377\u52a0\u5165\u83dc\u5355"

    invoke-direct {v5, v7, v2, v6, v1}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v6, La/c5$a;

    new-instance v1, La/b5;

    const/16 v2, 0xc

    invoke-direct {v1, v0, v2}, La/b5;-><init>(La/c5;I)V

    const-string v2, "\u901a\u8baf\u5f55\u5217\u8868"

    const-string v7, "contact_mvvm_address_v2"

    const/16 v8, 0xf

    invoke-direct {v6, v2, v7, v8, v1}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v7, La/c5$a;

    new-instance v1, La/b5;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, La/b5;-><init>(La/c5;I)V

    const-string v2, "\u641c\u7d22\u6846"

    const-string v9, "search_command_v2"

    invoke-direct {v7, v2, v9, v8, v1}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v2, La/b5;

    const/16 v9, 0xe

    invoke-direct {v2, v0, v9}, La/b5;-><init>(La/c5;I)V

    const-string v9, "\u8f6c\u53d1\u5217\u8868"

    const-string v10, "recent_forward_v2"

    invoke-direct {v1, v9, v10, v8, v2}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v9, La/c5$a;

    new-instance v2, La/b5;

    invoke-direct {v2, v0, v8}, La/b5;-><init>(La/c5;I)V

    const-string v8, "\u4f1a\u8bdd\u5b58\u50a8\u7c7b"

    const-string v10, "conv_storage_class_v1"

    const/16 v11, 0x8

    invoke-direct {v9, v8, v10, v11, v2}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v10, La/c5$a;

    new-instance v2, La/b5;

    const/16 v8, 0x10

    invoke-direct {v2, v0, v8}, La/b5;-><init>(La/c5;I)V

    const-string v8, "\u5b58\u50a8\u8f85\u52a9\u7c7b"

    const-string v12, "conv_storage_helper_v1"

    invoke-direct {v10, v8, v12, v11, v2}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/16 v12, 0x11

    invoke-direct {v8, v0, v12}, La/b5;-><init>(La/c5;I)V

    const-string v12, "Flutter\u901a\u8bdd\u7c7b"

    const-string v13, "flutter_voip_class_v1"

    const/4 v14, 0x6

    invoke-direct {v2, v12, v13, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v12, La/c5$a;

    new-instance v8, La/b5;

    const/16 v13, 0x12

    invoke-direct {v8, v0, v13}, La/b5;-><init>(La/c5;I)V

    const-string v13, "VoipMgr"

    const-string v15, "voip_mgr_class_v1"

    invoke-direct {v12, v13, v15, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v13, La/c5$a;

    new-instance v8, La/b5;

    const/16 v15, 0x13

    invoke-direct {v8, v0, v15}, La/b5;-><init>(La/c5;I)V

    const-string v15, "IncomingCallMgr"

    const-string v3, "incoming_call_mgr_v1"

    invoke-direct {v13, v15, v3, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v3, La/c5$a;

    new-instance v8, La/b5;

    const/16 v15, 0xb

    invoke-direct {v8, v0, v15}, La/b5;-><init>(La/c5;I)V

    const-string v15, "\u641c\u7d22\u7ed3\u679cRecyclerView"

    const-string v11, "search_recycler_bind_v1"

    invoke-direct {v3, v15, v11, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v15, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x14

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "\u4f1a\u8bdd\u5b58\u50a8\u63a5\u53e3(F010)"

    move-object/from16 v16, v1

    const-string v1, "conv_storage_iface"

    invoke-direct {v15, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x15

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "\u5168\u91cfj1\u5019\u9009(F010)"

    move-object/from16 v17, v2

    const-string v2, "all_j1_classes"

    invoke-direct {v1, v11, v2, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x16

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "gm-j1\u5019\u9009(F010)"

    move-object/from16 v18, v1

    const-string v1, "gm_j1_candidates"

    invoke-direct {v2, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x17

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "\u4f1a\u8bdd\u9690\u85cf\u65b9\u6cd5(F010)"

    move-object/from16 v19, v2

    const-string v2, "conv_hide_method"

    invoke-direct {v1, v11, v2, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x18

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "n\u65b9\u6cd5\u7c7b(F010)"

    move-object/from16 v20, v1

    const-string v1, "n_method_classes"

    invoke-direct {v2, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x19

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "P\u65b9\u6cd5(F010)"

    move-object/from16 v21, v2

    const-string v2, "p_method"

    invoke-direct {v1, v11, v2, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x1a

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "Sns\u65f6\u95f4\u7ebf\u9002\u914d\u5668"

    move-object/from16 v22, v1

    const-string v1, "sns_timeline_v1"

    invoke-direct {v2, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x1b

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "Sns\u65f6\u95f4\u7ebf\u9002\u914d\u5668(h2)"

    move-object/from16 v23, v2

    const-string v2, "sns_timeline_adapter_v1"

    invoke-direct {v1, v11, v2, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x1

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "Sns\u6d88\u606f\u9002\u914d\u5668"

    move-object/from16 v24, v1

    const-string v1, "sns_msg_adapter_v1"

    invoke-direct {v2, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x3

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "Sns\u6d88\u606f\u5173\u8054"

    move-object/from16 v25, v2

    const-string v2, "sns_msg_relevance_v1"

    invoke-direct {v1, v11, v2, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x4

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "Sns\u56de\u6536\u9002\u914d\u5668"

    move-object/from16 v26, v1

    const-string v1, "sns_recycler_adapter_v1"

    invoke-direct {v2, v11, v1, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x5

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "conv_hide_write_v1"

    const/16 v14, 0xa

    move-object/from16 v28, v2

    const-string v2, "\u4f1a\u8bdd\u9690\u85cf\u5199\u65b9\u6cd5(Phase E1)"

    invoke-direct {v1, v2, v11, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x6

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "\u901a\u8baf\u5f55\u52a0\u5bc6\u53cb\u83dc\u5355(Phase F)"

    const-string v14, "contact_menu_v1"

    move-object/from16 v29, v1

    const/4 v1, 0x6

    invoke-direct {v2, v11, v14, v1, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v8, La/b5;

    const/4 v11, 0x7

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "conv_adapter_structural_v1"

    const/16 v14, 0xc

    move-object/from16 v27, v2

    const-string v2, "\u4f1a\u8bddAdapter\u7ed3\u6784\u626b\u63cf"

    invoke-direct {v1, v2, v11, v14, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v2, La/c5$a;

    new-instance v8, La/b5;

    const/16 v11, 0x8

    invoke-direct {v8, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "\u901a\u8baf\u5f55\u52a0\u5bc6\u53cb\u83dc\u5355\u5b9a\u4f4d"

    const-string v14, "contact_add_mask_v1"

    move-object/from16 v30, v1

    const/16 v1, 0x8

    invoke-direct {v2, v11, v14, v1, v8}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v8, La/c5$a;

    new-instance v11, La/b5;

    const/16 v14, 0x9

    invoke-direct {v11, v0, v14}, La/b5;-><init>(La/c5;I)V

    const-string v14, "\u6d88\u606f\u5b58\u50a8\u5b9a\u4f4d(Phase3-B)"

    move-object/from16 p1, v2

    const-string v2, "msg_storage_v1"

    invoke-direct {v8, v14, v2, v1, v11}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    new-instance v1, La/c5$a;

    new-instance v2, La/b5;

    const/16 v11, 0xa

    invoke-direct {v2, v0, v11}, La/b5;-><init>(La/c5;I)V

    const-string v11, "version_info_v1"

    const/4 v14, 0x4

    move-object/from16 v31, v3

    const-string v3, "\u7248\u672c\u4fe1\u606f\u7c7b\u5b9a\u4f4d"

    invoke-direct {v1, v3, v11, v14, v2}, La/c5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILa/s7;)V

    move-object/from16 v11, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v28

    move-object/from16 v28, v30

    move-object/from16 v14, v31

    move-object/from16 v31, v1

    move-object/from16 v30, v8

    move-object/from16 v8, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v29

    move-object/from16 v29, p1

    filled-new-array/range {v4 .. v31}, [La/c5$a;

    move-result-object v1

    invoke-static {v1}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, La/c5;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/c5$a;

    iget v2, v2, La/c5$a;->c:I

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    iput v3, v0, La/c5;->e:I

    return-void
.end method

.method public static final b(Ljava/lang/String;)I
    .locals 9

    const-string v0, "com.tencent.mm.ui.contact.address"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "conversation"

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const-string v0, "com.tencent.mm.ui.contact"

    invoke-static {p0, v0, v1}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, v2, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const-string v3, "tf5."

    invoke-static {p0, v3, v1}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v0, v0, 0x2

    :cond_2
    invoke-static {p0, v2, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 v0, v0, -0x5

    :cond_3
    const-string v5, "fts"

    const-string v6, "room"

    const-string v2, "label"

    const-string v3, "sns"

    const-string v4, "plugin"

    const-string v7, "fav"

    const-string v8, "emoji"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p0, v3, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    add-int/lit8 v0, v0, -0x5

    :cond_6
    :goto_1
    return v0
.end method

.method public static final c(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final d(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static e(Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;
    .locals 3

    sget-object v0, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p1}, La/w1;->o(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    const-string p2, "DexKit: "

    if-eqz p1, :cond_3

    const-string p1, " found 0"

    invoke-static {p2, p0, p1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    return-object v1

    :cond_3
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONArray;

    invoke-static {v0}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v2, "classNames"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " \u2192 "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " classes"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-object p1
.end method

.method public static f(Ljava/lang/String;)I
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "java.lang.String"

    invoke-static {p0, v2, v0, v1}, La/w1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, La/c5;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "toString(...)"

    invoke-static {p2, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x64

    invoke-static {p2, v0}, La/Ce;->X(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DexKit: saved "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "...)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method
