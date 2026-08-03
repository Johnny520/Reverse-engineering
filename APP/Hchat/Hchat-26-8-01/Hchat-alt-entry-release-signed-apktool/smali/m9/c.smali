.class public final enum Lm9/c;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum h:Lm9/c;

.field public static final enum i:Lm9/c;

.field public static final synthetic j:[Lm9/c;


# instance fields
.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lm9/c;

    .line 2
    .line 3
    const-string v1, "RPS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lm9/c;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lm9/c;->h:Lm9/c;

    .line 11
    .line 12
    new-instance v1, Lm9/c;

    .line 13
    .line 14
    const-string v2, "DICE"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lm9/c;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lm9/c;->i:Lm9/c;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [Lm9/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lm9/c;->j:[Lm9/c;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lm9/c;->g:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm9/c;
    .locals 1

    .line 1
    const-class v0, Lm9/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lm9/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lm9/c;
    .locals 1

    .line 1
    sget-object v0, Lm9/c;->j:[Lm9/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lm9/c;

    .line 8
    .line 9
    return-object v0
.end method
