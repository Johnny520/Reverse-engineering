.class public final Lsu;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[B

.field public final d:Lcn;

.field public final e:Lyt;

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:LTB;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[BLcn;Lyt;ILjava/lang/String;LTB;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsu;->a:Ljava/lang/Object;

    iput-object p2, p0, Lsu;->b:Ljava/lang/Object;

    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lsu;->c:[B

    iput-object p4, p0, Lsu;->d:Lcn;

    iput-object p5, p0, Lsu;->e:Lyt;

    iput p6, p0, Lsu;->f:I

    iput-object p7, p0, Lsu;->g:Ljava/lang/String;

    iput-object p8, p0, Lsu;->h:LTB;

    return-void
.end method
