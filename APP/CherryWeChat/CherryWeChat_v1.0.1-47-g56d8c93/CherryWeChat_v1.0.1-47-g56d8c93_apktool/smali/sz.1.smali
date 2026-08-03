.class public final Lsz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:Lsz;

.field public static final b:Lru;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsz;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lsz;->a:Lsz;

    new-instance v0, Lru;

    const-string v1, "kotlin.String"

    sget-object v2, Lmu;->o:Lmu;

    invoke-direct {v0, v1, v2}, Lru;-><init>(Ljava/lang/String;Lnu;)V

    sput-object v0, Lsz;->b:Lru;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1}, LJc;->y()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lsz;->b:Lru;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    const/4 p1, 0x0

    throw p1
.end method
