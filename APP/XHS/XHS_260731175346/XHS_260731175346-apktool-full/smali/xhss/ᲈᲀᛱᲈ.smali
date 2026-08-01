.class public final Lxhss/ᲈᲀᛱᲈ;
.super Lxhss/ᛸᛴᛳᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Landroid/content/Context;

.field public synthetic ᛸᛲᲀᛵ:Ljava/lang/Object;

.field public ᛸᛴᛶᛳ:J

.field public final synthetic ᛸᛷᲈᲈ:Lxhss/ᛳᲀᛷᲀ;

.field public ᲀᲇᛳᲁ:Ljava/io/File;

.field public ᲇᛶᛴᲀ:Landroid/app/Dialog;

.field public ᲈᛳᲀ:I


# direct methods
.method public constructor <init>(Lxhss/ᛳᲀᛷᲀ;Lxhss/ᛸᛴᛳᛷ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᲈᲀᛱᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛳᲀᛷᲀ;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lxhss/ᛸᛴᛳᛷ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lxhss/ᲈᲀᛱᲈ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 9
    .line 10
    iget-object p1, p0, Lxhss/ᲈᲀᛱᲈ;->ᛸᛷᲈᲈ:Lxhss/ᛳᲀᛷᲀ;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, Lxhss/ᛳᲀᛷᲀ;->ᲇᛴᲇᛵ(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
