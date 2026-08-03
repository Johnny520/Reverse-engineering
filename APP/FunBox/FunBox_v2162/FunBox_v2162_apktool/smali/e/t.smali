.class public final Le/t;
.super Ln/e;
.source "SourceFile"


# static fields
.field public static final c:Le/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/t;-><init>(I)V

    sput-object v0, Le/t;->c:Le/t;

    return-void
.end method


# virtual methods
.method public final F()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/r;

    return-void
.end method
