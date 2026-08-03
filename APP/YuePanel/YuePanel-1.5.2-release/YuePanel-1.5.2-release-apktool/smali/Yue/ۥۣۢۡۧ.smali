.class public LYue/ۥۣۢۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۣۢۡۧ;->ۥ:I

    iput-object p2, p0, LYue/ۥۣۢۡۧ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۣۢۡۧ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۣۢۡۧ;

    iget p1, p1, LYue/ۥۣۢۡۧ;->ۥ:I

    iget v1, p0, LYue/ۥۣۢۡۧ;->ۥ:I

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۡۧ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
