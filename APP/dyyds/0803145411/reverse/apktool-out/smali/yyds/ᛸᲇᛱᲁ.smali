.class public final enum Lyyds/ᛸᲇᛱᲁ;
.super Ljava/lang/Enum;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final enum ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛱᲁ;

.field public static final synthetic ᲇᲈᛵᛷ:[Lyyds/ᛸᲇᛱᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛸᲇᛱᲁ;

    .line 2
    .line 3
    const-string v1, "SRGB"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lyyds/ᛸᲇᛱᲁ;

    .line 10
    .line 11
    const-string v2, "DISPLAY_P3"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lyyds/ᛸᲇᛱᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲇᛱᲁ;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lyyds/ᛸᲇᛱᲁ;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lyyds/ᛸᲇᛱᲁ;->ᲇᲈᛵᛷ:[Lyyds/ᛸᲇᛱᲁ;

    .line 24
    .line 25
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyyds/ᛸᲇᛱᲁ;
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛸᲇᛱᲁ;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛸᲇᛱᲁ;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lyyds/ᛸᲇᛱᲁ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛸᲇᛱᲁ;->ᲇᲈᛵᛷ:[Lyyds/ᛸᲇᛱᲁ;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lyyds/ᛸᲇᛱᲁ;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lyyds/ᛸᲇᛱᲁ;

    .line 8
    .line 9
    return-object v0
.end method
