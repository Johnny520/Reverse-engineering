.class public final synthetic Lyyds/ᲀᛶᛷᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Z


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛵᲀᛵᛸ;Landroid/content/Context;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᲀᛶᛷᛱ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲀᛶᛷᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲈᛵᛷ:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLyyds/ᛷᛴᛲᛷ;Lyyds/ᲈᛶᛱᛱ;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᲀᛶᛷᛱ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲈᛵᛷ:Z

    iput-object p2, p0, Lyyds/ᲀᛶᛷᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lyyds/ᲀᛶᛷᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᲀᛶᛷᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean p0, p0, Lyyds/ᲀᛶᛷᛱ;->ᲇᲈᛵᛷ:Z

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v1, Lyyds/ᛷᛴᛲᛷ;

    .line 13
    .line 14
    check-cast v0, Lyyds/ᲈᛶᛱᛱ;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p1, -0x1

    .line 24
    if-ne p0, p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, v0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v1, v0, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 36
    .line 37
    invoke-static {p1}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {v0, p0}, Lyyds/ᛲᛵᲇᛳ;->ᲇᲈᛵᛷ(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lyyds/ᲈᛶᛱᛱ;->ᛲᛳᛶᲁ()V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_0
    check-cast v1, Lyyds/ᛵᲀᛵᛸ;

    .line 58
    .line 59
    check-cast v0, Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v1, v0, p0}, Lyyds/ᛵᲀᛵᛸ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
