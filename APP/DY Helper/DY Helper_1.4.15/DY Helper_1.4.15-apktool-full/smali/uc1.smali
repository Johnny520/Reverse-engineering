.class public final enum Luc1;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum η:Luc1;

.field public static final enum θ:Luc1;

.field public static final synthetic ι:[Luc1;


# instance fields
.field public final ε:I

.field public final ζ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Luc1;

    .line 2
    .line 3
    const-string v1, "conversation_id"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "CONVERSATION_ID"

    .line 8
    .line 9
    invoke-direct {v0, v2, v3, v4, v1}, Luc1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Luc1;->η:Luc1;

    .line 13
    .line 14
    new-instance v1, Luc1;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const-string v4, "sec_pet_id"

    .line 18
    .line 19
    const-string v5, "SEC_PET_ID"

    .line 20
    .line 21
    invoke-direct {v1, v3, v2, v5, v4}, Luc1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Luc1;->θ:Luc1;

    .line 25
    .line 26
    filled-new-array {v0, v1}, [Luc1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Luc1;->ι:[Luc1;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Luc1;->ε:I

    .line 5
    .line 6
    iput-object p4, p0, Luc1;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Luc1;
    .locals 1

    .line 1
    const-class v0, Luc1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Luc1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Luc1;
    .locals 1

    .line 1
    sget-object v0, Luc1;->ι:[Luc1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Luc1;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final α(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iget p0, p0, Luc1;->ε:I

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, ":"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
