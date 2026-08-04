.class public final synthetic Lyyds/ᛱᛲᲈᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲇᛷᛶᲇ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛶᲈᛲᛵ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲈᛲᛵ;Lyyds/ᲇᛷᛶᲇ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛱᛲᲈᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᛲᲈᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲈᛲᛵ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛱᛲᲈᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛷᛶᲇ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᛱᛲᲈᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛱᛲᲈᛸ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛷᛶᲇ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛱᛲᲈᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲈᛲᛵ;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛶᲈᛲᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 11
    .line 12
    check-cast p0, Lyyds/ᛲᲈᛳᲈ;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lyyds/ᛲᲈᛳᲈ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    :try_start_0
    iget-object p0, p0, Lyyds/ᛶᲈᛲᛵ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 19
    .line 20
    iget-object p1, v0, Lyyds/ᲇᛷᛶᲇ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᛵᲇᲀ(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 28
    .line 29
    const-wide v0, -0x3f543e68a836eL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :pswitch_1
    :try_start_1
    iget-object p0, p0, Lyyds/ᛶᲈᛲᛵ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 43
    .line 44
    iget-object p1, v0, Lyyds/ᲇᛷᛶᲇ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛷᛵᲇᲀ(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catch_1
    move-exception p0

    .line 51
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 52
    .line 53
    const-wide v0, -0x3f53ae68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
