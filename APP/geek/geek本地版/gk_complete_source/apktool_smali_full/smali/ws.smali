.class public final synthetic Lws;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/app/Activity;

.field public final f:Lon;

.field public final g:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroid/app/Activity;Lon;Landroid/webkit/WebView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06df\u06e7"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e2\u06e2\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "prx"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "\u06df\u06e4\u06e2"

    invoke-static {v1}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    iput-object p3, p0, Lws;->c:Landroid/widget/LinearLayout;

    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v2, v2, -0x2269

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x1a

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    const-string v0, "\u06e4\u06e6\u06e2"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab9cf

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-object p7, p0, Lws;->g:Landroid/webkit/WebView;

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit16 v2, v2, 0x16e1

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    :cond_1
    const-string v0, "\u06e2\u06df\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p4, p0, Lws;->d:Landroid/widget/ScrollView;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v0, "\u06e7\u06e6\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06df\u06e2"

    goto :goto_2

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/lit16 v2, v2, -0x1417

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x32

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e6\u06e4"

    :goto_3
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e1\u06e2\u06e1"

    goto :goto_3

    :sswitch_6
    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    move-result v0

    if-ltz v0, :cond_7

    const-string v0, "\u06e4\u06e6\u06e2"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e6\u06df\u06e7"

    goto/16 :goto_1

    :sswitch_7
    iput-object p5, p0, Lws;->e:Landroid/app/Activity;

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e1\u06e2\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e2\u06e3\u06e8"

    goto :goto_3

    :sswitch_8
    iput-object p1, p0, Lws;->a:Landroid/widget/EditText;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac57c

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    iput-object p6, p0, Lws;->f:Lon;

    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v0, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v0, "\u06e6\u06df\u06e2"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v0, v2

    const v2, -0x1aa73c

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    add-int/lit16 v2, v2, -0x85f

    add-int/2addr v0, v2

    if-ltz v0, :cond_8

    const/16 v0, 0x4b

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e6\u06e0"

    :goto_4
    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sub-int/2addr v0, v2

    const v2, 0x1aab04

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    iput-object p2, p0, Lws;->b:Landroid/widget/TextView;

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v0

    if-gtz v0, :cond_9

    const/16 v0, 0x1b

    sput v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v0, "\u06e3\u06e6"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e8\u06e0\u06e1"

    goto :goto_4

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc63 -> :sswitch_0
        0xdcbe -> :sswitch_a
        0x1aa79d -> :sswitch_5
        0x1aa7c0 -> :sswitch_3
        0x1aaee0 -> :sswitch_c
        0x1ab246 -> :sswitch_6
        0x1ab2c7 -> :sswitch_9
        0x1aba80 -> :sswitch_4
        0x1abaa0 -> :sswitch_1
        0x1ac149 -> :sswitch_7
        0x1ac14e -> :sswitch_8
        0x1ac5e6 -> :sswitch_b
        0x1ac8e9 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    const-string v2, "\u06e7\u06e1\u06e1"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "Xz2kh4bDVdRCO7uW\n"

    const-string v7, "NlPU8vKcOLE=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget v7, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit16 v8, v8, 0x18f7

    add-int/2addr v7, v8

    if-ltz v7, :cond_8

    const/16 v7, 0x5c

    sput v7, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v7, "\u06e7\u06e2\u06e1"

    invoke-static {v7}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v14, v2

    goto :goto_0

    :sswitch_1
    const-string v2, "mLeSwmY0hUfTCSAL\n"

    const-string v7, "ficOJdKWYf8=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "\u06e6\u06e3\u06e2"

    :goto_1
    invoke-static {v7}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v13, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v2

    if-gtz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v2

    if-ltz v2, :cond_1

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    :cond_0
    const-string v2, "\u06e3\u06e1\u06e6"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v7, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/2addr v2, v7

    const v7, 0x1aaa08

    add-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :sswitch_3
    invoke-virtual {v5}, Landroid/view/ViewGroup;->removeAllViews()V

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v2, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    :cond_2
    const-string v2, "\u06e1\u06e0\u06e4"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e7\u06e2\u06e1"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :sswitch_4
    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v7, v7, 0x1e9a

    sub-int/2addr v2, v7

    if-ltz v2, :cond_4

    const/16 v2, 0x36

    sput v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v2, "\u06e6\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u06e3\u06e3\u06e6"

    :goto_2
    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_5
    sget-object v2, Lwg;->b:Lnf;

    invoke-static {v2}, Lip;->c(Lge;)Lid;

    move-result-object v15

    const/16 v18, 0x0

    new-instance v2, Lat;

    move-object/from16 v0, p0

    iget-object v7, v0, Lws;->f:Lon;

    move-object/from16 v0, p0

    iget-object v8, v0, Lws;->g:Landroid/webkit/WebView;

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v11}, Lat;-><init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lon;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lld;)V

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v7, v7, -0xb4

    move-object/from16 v0, v18

    invoke-static {v15, v0, v2, v7}, La80;->r(Loe;Lge;Lwm;I)Lp40;

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v2

    if-gtz v2, :cond_5

    const/16 v2, 0x1f

    sput v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v7, "\u06e7\u06e1\u06df"

    move-object v2, v13

    goto/16 :goto_1

    :cond_5
    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v7, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    or-int/2addr v2, v7

    const v7, 0x1ac253

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, p0

    iget-object v10, v0, Lws;->a:Landroid/widget/EditText;

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v7, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/lit16 v7, v7, 0x93b

    sub-int/2addr v2, v7

    if-gtz v2, :cond_6

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v2, "\u06df\u06e8\u06e7"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06e2\u06e1\u06df"

    move-object v2, v13

    goto/16 :goto_1

    :sswitch_7
    invoke-virtual {v10}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v2, :cond_7

    const/16 v2, 0x1b

    sput v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v2, "\u06e2\u06e1\u06df"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06e4\u06e5\u06e6"

    move-object v2, v13

    goto/16 :goto_1

    :sswitch_8
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_11

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    rem-int/lit16 v7, v7, -0xd4c

    or-int/2addr v2, v7

    if-ltz v2, :cond_9

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-object v2, v14

    :cond_8
    const-string v7, "\u06e7\u06e1\u06e8"

    :goto_3
    invoke-static {v7}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v14, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e7\u06e6\u06e6"

    :goto_4
    invoke-static {v2}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_9
    move-object v2, v12

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v10}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v7, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    mul-int/lit16 v7, v7, 0xde

    or-int/2addr v2, v7

    if-ltz v2, :cond_e

    const-string v2, "\u06e6\u06e7"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_a
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-wide/from16 v0, v16

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v2

    if-ltz v2, :cond_a

    const/16 v2, 0x43

    sput v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    :goto_5
    const-string v2, "\u06df\u06e0\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e6\u06e5\u06df"

    invoke-static {v2}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p0

    iget-object v5, v0, Lws;->c:Landroid/widget/LinearLayout;

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v7, v7, 0x1281

    or-int/2addr v2, v7

    if-gtz v2, :cond_2

    const-string v2, "\u06e6\u06e1\u06e1"

    goto/16 :goto_2

    :sswitch_c
    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v2, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v2, "\u06e0\u06e7\u06e3"

    :goto_6
    invoke-static {v2}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v7, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v2, v7

    const v7, 0x1ac6ef

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "aOvotxAD75to8fD7UgWulmft8PtED66bafCptUUM4tVy5/S+EAHgkXTx7b8eFueQcbDttUAV+phj\n6uy0VE7Hm3br8JZVFOaaYtPltVEH64c=\n"

    const-string v7, "Bp6E2zBgjvU=\n"

    invoke-static {v2, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v12}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "\u06e3\u06e5\u06e7"

    goto/16 :goto_4

    :sswitch_f
    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    rem-int/2addr v2, v7

    const v7, 0xdc4c

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {v6, v14}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    goto :goto_5

    :sswitch_11
    move-object/from16 v0, p0

    iget-object v4, v0, Lws;->b:Landroid/widget/TextView;

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v7, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/lit16 v7, v7, -0x342

    or-int/2addr v2, v7

    if-ltz v2, :cond_b

    const-string v2, "\u06e7\u06e6\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_b
    const-string v2, "\u06e6\u06e7"

    :goto_7
    invoke-static {v2}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_c
    :sswitch_12
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v7, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/lit16 v7, v7, -0x1928

    or-int/2addr v2, v7

    if-ltz v2, :cond_d

    const-string v2, "\u06e6\u06df\u06e7"

    goto/16 :goto_4

    :cond_d
    const-string v2, "\u06e6\u06e5\u06df"

    goto/16 :goto_4

    :sswitch_13
    move-object/from16 v0, p0

    iget-object v6, v0, Lws;->e:Landroid/app/Activity;

    const-string v7, "\u06e2\u06e7\u06e0"

    move-object v2, v14

    goto/16 :goto_3

    :sswitch_14
    const-string v2, "IlxkDs8ZUSO9GxJGXMTA"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->۟۟ۨۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v16

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v7, v7, -0xd18

    mul-int/2addr v2, v7

    if-ltz v2, :cond_f

    const/16 v2, 0x27

    sput v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    :cond_e
    const-string v2, "\u06e5\u06e7\u06e5"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/2addr v2, v7

    const v7, -0x1aa6df

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p0

    iget-object v9, v0, Lws;->d:Landroid/widget/ScrollView;

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v7, v7, 0x1739

    xor-int/2addr v2, v7

    if-ltz v2, :cond_10

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e6\u06e3\u06e2"

    goto :goto_7

    :cond_10
    const-string v2, "\u06e4\u06e3\u06e6"

    goto/16 :goto_6

    :cond_11
    :sswitch_16
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int/2addr v2, v7

    const v7, -0x1aa932

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc05 -> :sswitch_0
        0xdcc1 -> :sswitch_4
        0x1aa71e -> :sswitch_e
        0x1aa79f -> :sswitch_a
        0x1aa81e -> :sswitch_d
        0x1aaba1 -> :sswitch_1
        0x1aabbc -> :sswitch_14
        0x1aaea5 -> :sswitch_3
        0x1ab280 -> :sswitch_7
        0x1ab33b -> :sswitch_10
        0x1ab648 -> :sswitch_15
        0x1ab686 -> :sswitch_b
        0x1ab6c5 -> :sswitch_9
        0x1aba47 -> :sswitch_f
        0x1aba85 -> :sswitch_8
        0x1abe83 -> :sswitch_5
        0x1ac186 -> :sswitch_12
        0x1ac1c5 -> :sswitch_11
        0x1ac200 -> :sswitch_17
        0x1ac228 -> :sswitch_2
        0x1ac545 -> :sswitch_16
        0x1ac547 -> :sswitch_6
        0x1ac54e -> :sswitch_13
        0x1ac566 -> :sswitch_c
        0x1ac5e7 -> :sswitch_17
    .end sparse-switch
.end method
