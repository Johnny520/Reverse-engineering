.class public final enum Lyyds/ᛸᲇᛵᲁ;
.super Ljava/lang/Enum;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛸᲇᛵᲁ;

.field public static final enum ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛵᲁ;

.field public static final synthetic ᲇᲇᲇᛱ:[Lyyds/ᛸᲇᛵᲁ;

.field public static final enum ᲇᲈᛵᛷ:Lyyds/ᛸᲇᛵᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛸᲇᛵᲁ;

    .line 2
    .line 3
    const-string v1, "PREFER_ARGB_8888"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyyds/ᛸᲇᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛵᲁ;

    .line 10
    .line 11
    new-instance v1, Lyyds/ᛸᲇᛵᲁ;

    .line 12
    .line 13
    const-string v2, "PREFER_RGB_565"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lyyds/ᛸᲇᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲇᛵᲁ;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lyyds/ᛸᲇᛵᲁ;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lyyds/ᛸᲇᛵᲁ;->ᲇᲇᲇᛱ:[Lyyds/ᛸᲇᛵᲁ;

    .line 26
    .line 27
    sput-object v0, Lyyds/ᛸᲇᛵᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛸᲇᛵᲁ;

    .line 28
    .line 29
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyyds/ᛸᲇᛵᲁ;
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛸᲇᛵᲁ;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛸᲇᛵᲁ;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lyyds/ᛸᲇᛵᲁ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛸᲇᛵᲁ;->ᲇᲇᲇᛱ:[Lyyds/ᛸᲇᛵᲁ;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lyyds/ᛸᲇᛵᲁ;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lyyds/ᛸᲇᛵᲁ;

    .line 8
    .line 9
    return-object v0
.end method
