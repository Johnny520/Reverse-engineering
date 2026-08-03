.class public final LV0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;
.implements LV0/b;


# static fields
.field public static final a:LV0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV0/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LV0/c;->a:LV0/c;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()LV0/h;
    .locals 1

    sget-object v0, LV0/c;->a:LV0/c;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    sget-object v0, LE0/t;->a:LE0/t;

    return-object v0
.end method
