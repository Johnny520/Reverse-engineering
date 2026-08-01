.class public final synthetic Ll9;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Ll9;->a:I

    iput-object p2, p0, Ll9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06df\u06df"

    invoke-static {v1}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "6EYsALYPb4jJ6L0cKltQel"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۣۧۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v1, :cond_0

    :goto_1
    const-string v1, "\u06e3\u06e2\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    mul-int/2addr v1, v2

    const v2, -0x1abcd6

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    const-string v1, "\u06e0\u06e0\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v1, :cond_2

    :cond_2
    const-string v1, "\u06e0\u06e0\u06e4"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v1

    if-gtz v1, :cond_1

    goto :goto_1

    :sswitch_5
    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v1, v2

    const v2, -0x1ac909

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaae4 -> :sswitch_0
        0x1aab07 -> :sswitch_3
        0x1aaf3d -> :sswitch_5
        0x1aaf41 -> :sswitch_2
        0x1ab665 -> :sswitch_1
        0x1ac8c8 -> :sswitch_4
    .end sparse-switch
.end method
