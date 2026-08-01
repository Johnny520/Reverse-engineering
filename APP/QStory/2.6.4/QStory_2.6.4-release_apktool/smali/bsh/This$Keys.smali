.class enum Lbsh/This$Keys;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/This;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "Keys"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbsh/This$Keys;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbsh/This$Keys;

.field public static final enum BSHCLASSMODIFIERS:Lbsh/This$Keys;

.field public static final enum BSHCONSTRUCTORS:Lbsh/This$Keys;

.field public static final enum BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

.field public static final enum BSHINIT:Lbsh/This$Keys;

.field public static final enum BSHSTATIC:Lbsh/This$Keys;

.field public static final enum BSHSUPER:Lbsh/This$Keys;

.field public static final enum BSHTHIS:Lbsh/This$Keys;


# direct methods
.method private static synthetic $values()[Lbsh/This$Keys;
    .locals 7

    .line 1
    sget-object v0, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 2
    .line 3
    sget-object v1, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 4
    .line 5
    sget-object v2, Lbsh/This$Keys;->BSHSUPER:Lbsh/This$Keys;

    .line 6
    .line 7
    sget-object v3, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 8
    .line 9
    sget-object v4, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 10
    .line 11
    sget-object v5, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    .line 12
    .line 13
    sget-object v6, Lbsh/This$Keys;->BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lbsh/This$Keys;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbsh/This$Keys$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/This$Keys$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/This$Keys;->BSHSTATIC:Lbsh/This$Keys;

    .line 7
    .line 8
    new-instance v0, Lbsh/This$Keys$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lbsh/This$Keys$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lbsh/This$Keys;->BSHTHIS:Lbsh/This$Keys;

    .line 14
    .line 15
    new-instance v0, Lbsh/This$Keys$3;

    .line 16
    .line 17
    invoke-direct {v0}, Lbsh/This$Keys$3;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbsh/This$Keys;->BSHSUPER:Lbsh/This$Keys;

    .line 21
    .line 22
    new-instance v0, Lbsh/This$Keys$4;

    .line 23
    .line 24
    invoke-direct {v0}, Lbsh/This$Keys$4;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lbsh/This$Keys;->BSHINIT:Lbsh/This$Keys;

    .line 28
    .line 29
    new-instance v0, Lbsh/This$Keys$5;

    .line 30
    .line 31
    invoke-direct {v0}, Lbsh/This$Keys$5;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lbsh/This$Keys;->BSHCONSTRUCTORS:Lbsh/This$Keys;

    .line 35
    .line 36
    new-instance v0, Lbsh/This$Keys$6;

    .line 37
    .line 38
    invoke-direct {v0}, Lbsh/This$Keys$6;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lbsh/This$Keys;->BSHCLASSMODIFIERS:Lbsh/This$Keys;

    .line 42
    .line 43
    new-instance v0, Lbsh/This$Keys$7;

    .line 44
    .line 45
    invoke-direct {v0}, Lbsh/This$Keys$7;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lbsh/This$Keys;->BSHEXTENSIONMETHODRECEIVER:Lbsh/This$Keys;

    .line 49
    .line 50
    invoke-static {}, Lbsh/This$Keys;->$values()[Lbsh/This$Keys;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lbsh/This$Keys;->$VALUES:[Lbsh/This$Keys;

    .line 55
    .line 56
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbsh/This$Keys;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbsh/This$Keys;
    .locals 1

    .line 1
    const-class v0, Lbsh/This$Keys;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbsh/This$Keys;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbsh/This$Keys;
    .locals 1

    .line 1
    sget-object v0, Lbsh/This$Keys;->$VALUES:[Lbsh/This$Keys;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lbsh/This$Keys;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbsh/This$Keys;

    .line 8
    .line 9
    return-object v0
.end method
