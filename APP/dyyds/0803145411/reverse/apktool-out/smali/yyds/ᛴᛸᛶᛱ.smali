.class public final Lyyds/ᛴᛸᛶᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛴᛳᛷ;


# instance fields
.field public final ᛱᲈᲁ:Ljava/lang/Object;

.field public ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lcom/android/app/CustomCardView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lyyds/ᛴᛸᛶᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 46
    iput-object p2, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 47
    iput-object p3, p0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 48
    iput-object p4, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 49
    iput-object p5, p0, Lyyds/ᛴᛸᛶᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 50
    iput-object p6, p0, Lyyds/ᛴᛸᛶᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 51
    iput-object p7, p0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᲈᛳᛳᛵ;Lyyds/ᲈᛳᛳᛵ;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Lyyds/ᛱᛱᛴ;

    const/16 v1, 0x16

    invoke-direct {v0, v1, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    const/16 v1, 0x96

    .line 54
    invoke-static {v1, v0}, Lyyds/ᲁᛴᛵᛱ;->ᛷᲈᲈᲁ(ILyyds/ᛶᲁᛸᛷ;)Lyyds/ᛳᛷᲀᛴ;

    move-result-object v0

    iput-object v0, p0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 55
    iput-object p1, p0, Lyyds/ᛴᛸᛶᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 57
    iput-object p3, p0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 58
    iput-object p4, p0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 59
    iput-object p5, p0, Lyyds/ᛴᛸᛶᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 60
    iput-object p6, p0, Lyyds/ᛴᛸᛶᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    return-void
.end method
