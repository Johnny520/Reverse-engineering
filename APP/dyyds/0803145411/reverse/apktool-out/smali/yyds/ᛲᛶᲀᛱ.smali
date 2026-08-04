.class public final Lyyds/ᛲᛶᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛶᲇᲁ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;


# direct methods
.method public constructor <init>(Lcom/ss/android/ugc/awemes/WardDatabase;)V
    .locals 2

    .line 1
    const-wide v0, -0x4e0b3e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 13
    .line 14
    new-instance p1, Lyyds/ᛷᛶᲇᲁ;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛲᛶᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛶᲇᲁ;

    .line 20
    .line 21
    new-instance p1, Lyyds/ᛱᛵᲈᲁ;

    .line 22
    .line 23
    const/16 v0, 0x1c

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lyyds/ᛲᛶᲀᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    const-wide v0, -0x4fc63e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lyyds/ᛶᛳᛷ;

    .line 11
    .line 12
    const/16 v2, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v0, v2}, Lyyds/ᛶᛳᛷ;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛲᛶᲀᛱ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase;

    .line 18
    .line 19
    invoke-static {p0, v1}, Lyyds/ᲀᛳᛳᛱ;->ᛲᛲᲈᲈ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛷᛴᲈᲀ;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    return-void
.end method
