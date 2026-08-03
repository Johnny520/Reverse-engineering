.class public final L۟/s;
.super L۟/ob;
.source "SourceFile"


# static fields
.field public static volatile ۥ۟:L۟/s;

.field public static final ۥ۟۟:L۟/s$a;


# instance fields
.field public ۥ:L۟/h1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/s$a;

    invoke-direct {v0}, L۟/s$a;-><init>()V

    sput-object v0, L۟/s;->ۥ۟۟:L۟/s$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, L۟/ob;-><init>()V

    new-instance v0, L۟/h1;

    invoke-direct {v0}, L۟/h1;-><init>()V

    iput-object v0, p0, L۟/s;->ۥ:L۟/h1;

    return-void
.end method
