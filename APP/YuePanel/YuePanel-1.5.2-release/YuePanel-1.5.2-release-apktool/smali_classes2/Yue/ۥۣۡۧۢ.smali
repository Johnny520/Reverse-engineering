.class public LYue/ۥۣۡۧۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:I

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, LYue/ۥۣۡۧۢ;->ۥ:I

    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    .line 12
    iput-object p2, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, LYue/ۥۣۡۧۢ;->ۥ:I

    .line 15
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    .line 16
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣ۟ۤۤ;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v0

    iput v0, p0, LYue/ۥۣۡۧۢ;->ۥ:I

    .line 3
    invoke-virtual {p1}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۢۤ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(LYue/ۥۣ۟ۤۤ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, LYue/ۥۣ۟ۤۤ;->ۥۣ۟۟ۢ()I

    move-result v0

    iput v0, p0, LYue/ۥۣۡۧۢ;->ۥ:I

    .line 7
    invoke-virtual {p1}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟ۢۤ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    .line 8
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۧۢ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۧۢ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣۡۧۢ;->ۥ:I

    return v0
.end method
