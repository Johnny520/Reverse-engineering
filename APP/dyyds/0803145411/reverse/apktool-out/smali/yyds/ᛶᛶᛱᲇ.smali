.class public final synthetic Lyyds/ᛶᛶᛱᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛶᛶᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛶᛶᛱᲇ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lyyds/ᲈᛷᛵᛷ;->ᛳᛸᛴᛶ(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲁᲁᛵ:Lyyds/ᛳᲀᛲ;

    .line 15
    .line 16
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 17
    .line 18
    const/16 v1, 0x49

    .line 19
    .line 20
    aget-object v0, v0, v1

    .line 21
    .line 22
    iget v1, p0, Lyyds/ᛶᛶᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p1, v0, v2}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lyyds/ᛶᛶᛱᲇ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v1, p0}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛱᲁᛳ(ILjava/util/List;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 37
    .line 38
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
