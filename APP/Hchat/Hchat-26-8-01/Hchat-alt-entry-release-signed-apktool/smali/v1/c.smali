.class public abstract Lv1/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lv1/j;

.field public static final b:Lv1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv1/j;

    .line 2
    .line 3
    sget-object v1, Lv1/a;->n:Lv1/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lv1/j;-><init>(Lfg/p;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv1/c;->a:Lv1/j;

    .line 9
    .line 10
    new-instance v0, Lv1/j;

    .line 11
    .line 12
    sget-object v1, Lv1/b;->n:Lv1/b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lv1/j;-><init>(Lfg/p;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lv1/c;->b:Lv1/j;

    .line 18
    .line 19
    return-void
.end method
