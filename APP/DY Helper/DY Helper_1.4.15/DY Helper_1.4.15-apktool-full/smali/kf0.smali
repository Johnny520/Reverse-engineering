.class public final enum Lkf0;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ε:Lkf0;

.field public static final enum ζ:Lkf0;

.field public static final synthetic η:[Lkf0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkf0;

    .line 2
    .line 3
    const-string v1, "MILLISECONDS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lkf0;->ε:Lkf0;

    .line 10
    .line 11
    new-instance v1, Lkf0;

    .line 12
    .line 13
    const-string v2, "SECONDS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lkf0;->ζ:Lkf0;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lkf0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lkf0;->η:[Lkf0;

    .line 26
    .line 27
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkf0;
    .locals 1

    .line 1
    const-class v0, Lkf0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkf0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lkf0;
    .locals 1

    .line 1
    sget-object v0, Lkf0;->η:[Lkf0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkf0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final α(J)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne p0, v2, :cond_2

    .line 16
    .line 17
    const-wide/16 v2, 0x3e8

    .line 18
    .line 19
    div-long v4, p1, v2

    .line 20
    .line 21
    rem-long/2addr p1, v2

    .line 22
    cmp-long p0, p1, v0

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-wide/16 v0, 0x1

    .line 28
    .line 29
    :goto_0
    add-long/2addr v4, v0

    .line 30
    return-wide v4

    .line 31
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 32
    .line 33
    .line 34
    const-wide/16 p0, 0x0

    .line 35
    .line 36
    return-wide p0

    .line 37
    :cond_3
    return-wide p1
.end method

.method public final β(J)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p0, v0, :cond_2

    .line 16
    .line 17
    const-wide v0, 0x20c49ba5e353f7L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long p0, p1, v0

    .line 23
    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    move-wide p1, v0

    .line 27
    :cond_1
    const-wide/16 v0, 0x3e8

    .line 28
    .line 29
    mul-long/2addr p1, v0

    .line 30
    return-wide p1

    .line 31
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 32
    .line 33
    .line 34
    const-wide/16 p0, 0x0

    .line 35
    .line 36
    return-wide p0

    .line 37
    :cond_3
    return-wide p1
.end method
