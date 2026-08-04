.class final enum Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;
.super Ljava/lang/Enum;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛴᛱᛸᛸ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "\u16f5\u16f8\u16f8\u16f7"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyyds/\u16f4\u16f1\u16f8\u16f8$\u16f5\u16f8\u16f8\u16f7;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

.field private static final synthetic ᛶᛷᛲᲁ:Lyyds/ᛲᛳᛸᲈ;

.field private static final synthetic ᲇᲇᲇᛱ:[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

.field public static final enum ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;


# instance fields
.field private final ᲀᛲᛳᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 2
    .line 3
    const-wide v1, -0x26f6ee68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v0, v1, v2, v3}, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 18
    .line 19
    new-instance v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 20
    .line 21
    const-wide v1, -0x26f76e68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-direct {v0, v1, v3, v2}, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 35
    .line 36
    invoke-static {}, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᛲᲈᲁ()[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲇᲇᲇᛱ:[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 41
    .line 42
    new-instance v1, Lyyds/ᛲᲁᲇᲁ;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lyyds/ᛲᲁᲇᲁ;-><init>([Ljava/lang/Enum;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛳᛸᲈ;

    .line 48
    .line 49
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲇᲇᲇᛱ:[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final synthetic ᛲᲈᲁ()[Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static ᲀᛲᛳᲀ()Lyyds/ᛲᛳᛸᲈ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyyds/\u16f2\u16f3\u16f8\u1c88;"
        }
    .end annotation

    .line 1
    sget-object v0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛳᛸᲈ;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛴᛱᛸᛸ$ᛵᛸᛸᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return p0
.end method
