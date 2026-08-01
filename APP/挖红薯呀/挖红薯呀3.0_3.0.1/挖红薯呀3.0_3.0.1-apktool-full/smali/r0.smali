.class public abstract Lr0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final f:Landroid/view/View$AccessibilityDelegate;


# instance fields
.field public final d:Landroid/view/View$AccessibilityDelegate;

.field public final e:Lq0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr0;->f:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr0;->f:Landroid/view/View$AccessibilityDelegate;

    .line 5
    .line 6
    iput-object v0, p0, Lr0;->d:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    new-instance v0, Lq0;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lq0;-><init>(Lr0;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr0;->e:Lq0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/view/View;)Ld;
.end method
