.class public final Lut;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final e:LPg;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ltt;

.field public final c:Ljava/lang/String;

.field public volatile d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LPg;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, LPg;-><init>(I)V

    sput-object v0, Lut;->e:LPg;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lut;->c:Ljava/lang/String;

    iput-object p2, p0, Lut;->a:Ljava/lang/Object;

    iput-object p3, p0, Lut;->b:Ltt;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must not be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;)Lut;
    .locals 2

    new-instance v0, Lut;

    sget-object v1, Lut;->e:LPg;

    invoke-direct {v0, p0, p1, v1}, Lut;-><init>(Ljava/lang/String;Ljava/lang/Object;Ltt;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lut;

    if-eqz v0, :cond_0

    check-cast p1, Lut;

    iget-object v0, p0, Lut;->c:Ljava/lang/String;

    iget-object p1, p1, Lut;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lut;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Option{key=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lut;->c:Ljava/lang/String;

    const-string v2, "\'}"

    invoke-static {v0, v1, v2}, LEy;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
