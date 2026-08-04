.class public final Lyyds/ᲈᛷᲈᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᲈᛷᲈᛲ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᲈᛷᲈᛲ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᛷᲈᛲ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲈᛷᲈᛲ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lyyds/ᲈᛷᲈᛲ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᲈᛷᲈᛲ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    iget v1, p1, Lyyds/ᲈᛷᲈᛲ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget p0, p0, Lyyds/ᲈᛷᲈᛲ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    iget p1, p1, Lyyds/ᲈᛷᲈᛲ;->ᲇᲈᛵᛷ:I

    .line 13
    .line 14
    sub-int/2addr p0, p1

    .line 15
    return p0

    .line 16
    :cond_0
    return v0
.end method
