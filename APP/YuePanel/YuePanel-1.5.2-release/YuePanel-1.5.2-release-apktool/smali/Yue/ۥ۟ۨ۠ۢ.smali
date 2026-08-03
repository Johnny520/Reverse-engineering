.class public LYue/ۥ۟ۨ۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# static fields
.field public static final ۥ۟۟:LYue/ۥ۟ۨ۠ۢ;

.field public static final ۥ۟۟۟:LYue/ۥ۟ۨ۠ۢ;

.field public static final ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۢ;

.field public static final ۥ۟۟۟۠:LYue/ۥ۟ۨ۠ۢ;


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟ۨ۠ۢ;

    const/4 v1, 0x0

    const-string v2, "NONE"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۢ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۢ;

    new-instance v0, LYue/ۥ۟ۨ۠ۢ;

    const/4 v1, 0x1

    const-string v2, "OPTIONAL"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۢ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟:LYue/ۥ۟ۨ۠ۢ;

    new-instance v0, LYue/ۥ۟ۨ۠ۢ;

    const/4 v1, 0x2

    const-string v2, "ZEROMANY"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۢ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۢ;

    new-instance v0, LYue/ۥ۟ۨ۠ۢ;

    const/4 v1, 0x3

    const-string v2, "ONEMANY"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۨ۠ۢ;-><init>(ILjava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۨ۠ۢ;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۟ۨ۠ۢ;->ۥ:I

    iput-object p2, p0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۨ۠ۢ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۨ۠ۢ;

    iget p1, p1, LYue/ۥ۟ۨ۠ۢ;->ۥ:I

    iget v1, p0, LYue/ۥ۟ۨ۠ۢ;->ۥ:I

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟:LYue/ۥ۟ۨ۠ۢ;

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟:LYue/ۥ۟ۨ۠ۢ;

    if-ne p0, v0, :cond_1

    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟۟:LYue/ۥ۟ۨ۠ۢ;

    if-ne p0, v0, :cond_2

    const-string v0, "*"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object v0, LYue/ۥ۟ۨ۠ۢ;->ۥ۟۟۟۠:LYue/ۥ۟ۨ۠ۢ;

    if-ne p0, v0, :cond_3

    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
