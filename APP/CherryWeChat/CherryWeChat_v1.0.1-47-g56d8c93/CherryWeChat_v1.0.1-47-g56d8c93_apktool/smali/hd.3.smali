.class public final Lhd;
.super Llx;
.source ""


# static fields
.field public static final c:Lhd;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lhd;

    sget v2, LmA;->c:I

    sget v3, LmA;->d:I

    sget-wide v4, LmA;->e:J

    sget-object v6, LmA;->a:Ljava/lang/String;

    invoke-direct {v0}, Lbc;-><init>()V

    new-instance v1, Lec;

    invoke-direct/range {v1 .. v6}, Lec;-><init>(IIJLjava/lang/String;)V

    iput-object v1, v0, Llx;->b:Lec;

    sput-object v0, Lhd;->c:Lhd;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
