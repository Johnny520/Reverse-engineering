.class public final synthetic Lyyds/ᛳᛱᛳ;
.super Lyyds/ᛲᲀᲇᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# static fields
.field public static final ᛷᲈᲈᲁ:Lyyds/ᛳᛱᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛳᛱᛳ;

    .line 2
    .line 3
    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x2

    .line 7
    const-class v2, Lyyds/ᛴᛷᛴᲇ;

    .line 8
    .line 9
    const-string v3, "createSegment"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lyyds/ᛲᲀᲇᛷ;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᛳᛱᛳ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛱᛳ;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    check-cast p2, Lyyds/ᛵᛳᛳᛷ;

    .line 8
    .line 9
    sget v0, Lyyds/ᛴᛷᛴᲇ;->ᛲᲈᲁ:I

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛵᛳᛳᛷ;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, p1, p2, v1}, Lyyds/ᛵᛳᛳᛷ;-><init>(JLyyds/ᛵᛳᛳᛷ;I)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
